package top.zhuchl.designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/**
 * @Author AlphaZcl
 * @Date 2021/8/21
 **/
public class SingletonTest {

    @Test
    public void test1() throws ExecutionException, InterruptedException {
        Callable<Singleton2> c = new Callable<Singleton2>() {
            @Override
            public Singleton2 call() throws Exception {
                return Singleton2.getInstance();
            }
        };
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Singleton2> f1 = ex.submit(c);
        Future<Singleton2> f2 = ex.submit(c);
        Singleton2 s1 = f1.get();
        Singleton2 s2 = f2.get();
        System.out.println(s1 == s2);
    }
}
