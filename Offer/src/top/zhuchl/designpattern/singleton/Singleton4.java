package top.zhuchl.designpattern.singleton;

/**
 * 线程不安全
 *
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        if(instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
