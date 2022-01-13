package top.zhuchl.designpattern.singleton;

/**
 * 饿汉式：静态代码块
 *
 * @Author AlphaZcl
 * @Date 2021/8/21
 **/
public class Singleton {
    private static final Singleton instance;
    private Singleton(){}

    static {
        instance = new Singleton();
    }
}
