package top.zhuchl.designpattern.singleton;

/**
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public class Singleton7 {

    private static Singleton7 instance;

    private Singleton7(){}

    private static Singleton7 getInstance(){
        if(instance == null) {
            synchronized (Singleton7.class){
                if(instance == null){
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }
}
