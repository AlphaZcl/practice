package top.zhuchl.designpattern.facade.subsys;

/**
 * 子系统：影院灯光系统
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public class TheaterLightSystem {

    private static TheaterLightSystem instance ;

    private TheaterLightSystem(){}

    public static TheaterLightSystem getInstance(){
        if(instance == null){
            synchronized (TheaterLightSystem.class){
                if(instance == null){
                    instance = new TheaterLightSystem();
                }
            }
        }
        return instance;
    }

    public void turnOn(){
        System.out.println("Stereo 打开");
    }

    public void turnOff(){
        System.out.println("Stereo 关闭");
    }
}
