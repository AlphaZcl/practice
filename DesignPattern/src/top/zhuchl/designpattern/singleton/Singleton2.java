package top.zhuchl.designpattern.singleton;

/**
 * 懒汉式
 *
 * @Author AlphaZcl
 * @Date 2021/8/21
 **/
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance() throws InterruptedException {
        if(instance == null){
            synchronized (Singleton2.class){
                if(instance == null){
                    Thread.sleep(1000);
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

}
