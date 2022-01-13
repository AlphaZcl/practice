package top.zhuchl.designpattern.singleton;

/**
 * 懒汉式：静态内部类
 *
 * @Author AlphaZcl
 * @Date 2021/8/21
 **/
public class Singleton3 {

    private Singleton3(){}

    private static class Inner{
        private final static Singleton3 instance = new Singleton3();
    }

    private static Singleton3 getInstance(){
        return Inner.instance;
    }
}
