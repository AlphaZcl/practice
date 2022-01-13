package top.zhuchl.designpattern.singleton;

/**
 * 线程安全，同步代码块
 *
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public class Singleton6 {

    private static Singleton6 instance;

    private Singleton6(){}

    private static Singleton6 getInstance(){
        if (instance == null) {
            synchronized (Singleton6.class){
                instance = new Singleton6();
            }
        }
        return instance;
    }
}
