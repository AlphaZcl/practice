import lombok.Getter;
import lombok.ToString;
import org.apache.commons.collections4.CollectionUtils;
import org.redisson.Redisson;
import org.redisson.api.*;
import org.redisson.client.codec.StringCodec;
import org.redisson.config.Config;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2024/10/27
 **/
public class Main {

    private static final Integer SIZE = 5;

    public static void main(String[] args) {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://172.16.116.138:6379").setPassword("123456");
        RedissonClient redissonClient = Redisson.create(config);
        ExecutorService executorService = Executors.newFixedThreadPool(SIZE);
        try {

            System.out.println("线程:" + Thread.currentThread().getId() + "startEd");
            RCountDownLatch countDownLatch = redissonClient.getCountDownLatch("countDownLatch");
            countDownLatch.trySetCount(SIZE + 1);
            Random random = new Random();
            for (int i = 0; i < SIZE + 1; i++) {
                List<Integer> collect = Stream.iterate(0, n -> n + 1).limit(5).map(idx -> random.nextInt(10) + 1).distinct().collect(Collectors.toList());
                if (i == SIZE%2) {
                    List<Integer> delIDs = collect.subList(0, collect.size() / 2);
                    // 模拟删除
                    executorService.submit(() -> {
                        doDel(delIDs, redissonClient);
                        countDownLatch.countDown();
                    });
                } else {
                    final int curI = i;
                    executorService.submit(() -> {
                        doQueryTask(redissonClient, collect, curI == SIZE/2);
                        countDownLatch.countDown();
                    });
                }
            }
            countDownLatch.await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
            redissonClient.shutdown();
        }
    }

    private static void testS(RedissonClient redissonClient) {
        RBatch rBatch = redissonClient.createBatch();
        RBucketAsync<Object> bucket1 = rBatch.getBucket("test1", StringCodec.INSTANCE);
        RBucketAsync<Object> bucket2 = rBatch.getBucket("test2", StringCodec.INSTANCE);
        RFuture<Object> cmd1 = bucket1.getAsync();
        RFuture<Object> cmd2 = bucket2.getAsync();
        rBatch.executeAsync().whenComplete((res, err) -> {
            System.out.println("查询redis完毕，开始处理结果");
            List<?> responses = res.getResponses();
            System.out.println(responses);
            Object join1 = cmd1.join();
            Object join2 = cmd2.join();
            System.out.println("test1:" + join1);
            System.out.println("test2:" + join2);
            System.out.println("sssssss");
        }).exceptionally(throwable -> {
            System.out.println("=============查询失败" + throwable);
            return null;
        });
        // 保存
        RBatch rSaveBatch = redissonClient.createBatch();
        RBucketAsync<Object> bucket = rSaveBatch.getBucket("test1");
        bucket.setAsync("sssss", 30L, TimeUnit.SECONDS);
        rSaveBatch.executeAsync().exceptionally(throwable -> {
            System.out.println("保存缓存失败");
            return null;
        });
        System.out.println("主线程");
    }

    private static void doQueryTask(RedissonClient redissonClient, List<Integer> collect, boolean flag) {
        System.out.println("线程:" + Thread.currentThread().getId() + "当前查询的id：" + collect);
        // 先查询获取缓存值
        RBatch rQueryBatch = redissonClient.createBatch();
        Map<Integer, RFuture<Entity>> rGetFutureMap = collect.stream().collect(Collectors.toMap(idx -> idx, idx -> {
            String cacheKey = wrapCacheKey(idx);
            RBucketAsync<Entity> bucket = rQueryBatch.getBucket(cacheKey);
            return bucket.getAsync();
        }));
        Function<Integer, Entity> cacheResultNotNullFunc = id -> {
            // key一致不会不存在，
            Entity cacheResult = rGetFutureMap.get(id).join();
            if (cacheResult == null) {
//                System.out.println("线程:" + Thread.currentThread().getId() + "为空的缓存id：" + id);
                return null;
            }
            return cacheResult;
        };
        List<Entity> cacheResult = rQueryBatch.executeAsync().thenApplyAsync(batchResult -> {
            // 过滤出不为null的缓存数据
            return collect.stream().map(cacheResultNotNullFunc).filter(Objects::nonNull).collect(Collectors.toList());
        }).exceptionally(throwable -> {
            // 查询缓存失败
            System.out.println("线程:" + Thread.currentThread().getId() + "查询缓存失败：" + throwable.getMessage());
            return new ArrayList<Entity>();
        }).toCompletableFuture().join();
        List<Integer> cacheResultId = cacheResult.stream().map(Entity::getId).collect(Collectors.toList());
        System.out.println("线程:" + Thread.currentThread().getId()  + "此时缓存数据为：" +cacheResult);
        if (flag) {
            System.out.println("线程:" + Thread.currentThread().getId() + "长时间查询" + collect);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // 根据缓存数据，补充查询
        List<Integer> noCacheResultIds = collect.stream().filter(id -> !cacheResultId.contains(id)).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(noCacheResultIds)) {
            List<Entity> databaseResult = getDatabaseResult(noCacheResultIds);
            RBatch rSaveBatch = redissonClient.createBatch();
            databaseResult.stream().forEach(entity -> {
                String cacheKey = wrapCacheKey(entity.getId());
                RBucketAsync<Object> bucket = rSaveBatch.getBucket(cacheKey);
                bucket.compareAndSetAsync(null, entity);
                bucket.expireAsync(100L, TimeUnit.SECONDS);
            });
            rSaveBatch.executeAsync().exceptionally(throwable -> {
                // 保存失败
                System.out.println("线程:" + Thread.currentThread().getId() + "警告，保存失败：" + throwable.getMessage());
                return null;
            });
            System.out.println("线程:" + Thread.currentThread().getId() + "数据库数据：" + databaseResult);
            cacheResult.addAll(databaseResult);
            System.out.println("线程:" + Thread.currentThread().getId() + ",保存完数据完成查询动作:" + cacheResult);
            return;
        }
        // 完成查询
        System.out.println("线程:" + Thread.currentThread().getId() + ",全量走缓存，完成查询动作:" + cacheResult);
    }

    private static void doDel(List<Integer> ids, RedissonClient redissonClient) {
        System.out.println("线程:" + Thread.currentThread().getId() + ",删除任务：" + ids);
        RBatch rDelBatch = redissonClient.createBatch();
        ids.stream().forEach(id -> {
            String cacheKey = wrapCacheKey(id);
            RBucketAsync<Object> bucket = rDelBatch.getBucket(cacheKey);
            bucket.deleteAsync();
        });
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        rDelBatch.executeAsync();
        System.out.println("线程:" + Thread.currentThread().getId() + ",删除完成：" + ids);
    }

    private static String wrapCacheKey(Integer idx) {
        return "test:" + idx;
    }

    private static List<Entity> getDatabaseResult(List<Integer> noCacheResultIds) {
        return noCacheResultIds.stream().map(id -> new Entity(id, "val" + id)).collect(Collectors.toList());
    }


    @Getter
    @ToString
    private static class Entity implements Serializable {
        private String val;

        private Integer id;

        public Entity(Integer id, String val) {
            this.val = val;
            this.id = id;
        }
    }
}
