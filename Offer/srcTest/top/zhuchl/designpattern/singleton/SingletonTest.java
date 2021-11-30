package top.zhuchl.designpattern.singleton;

import org.junit.jupiter.api.DisplayName;
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

    @Test
    @DisplayName("枚举方式")
    public void test2(){
        Singleton8 instacne = Singleton8.INSTACNE;
        Singleton8 instacne1 = Singleton8.INSTACNE;
        System.out.println(instacne == instacne1);
        System.out.println(instacne.hashCode());
        System.out.println(instacne1.hashCode());
    }
}
