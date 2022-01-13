package top.zhuchl.designpattern.singleton;

/**
 * 线程安全，同步方法，效率低下
 *
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5(){}

    public static synchronized Singleton5 getInstance(){
        if(instance == null){
            instance = new Singleton5();
        }
        return instance;
    }

}
