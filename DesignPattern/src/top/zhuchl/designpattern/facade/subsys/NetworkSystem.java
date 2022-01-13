package top.zhuchl.designpattern.facade.subsys;

/**
 * 子系统：网络系统
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public class NetworkSystem {

    private NetworkSystem(){}

    private static class Inner{
        private final static NetworkSystem instance = new NetworkSystem();
    }

    public static NetworkSystem getInstance(){
        return Inner.instance;
    }

    public void turnOff(){
        System.out.println("NetworkSystem 关闭");
    }

    public void turnOn(){
        System.out.println("NetworkSystem 开启");
    }
}
