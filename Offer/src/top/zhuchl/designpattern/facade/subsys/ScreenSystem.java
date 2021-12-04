package top.zhuchl.designpattern.facade.subsys;

/**
 * 子系统：屏幕
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public class ScreenSystem {

    private ScreenSystem(){}

    private static class Inner{
        public static final ScreenSystem instance = new ScreenSystem();
    }

    public static ScreenSystem getInstance(){
        return Inner.instance;
    }

    public void turnOff(){
        System.out.println("ScreenSystem off");
    }

    public void turnOn(){
        System.out.println("ScreenSystem on");
    }
}
