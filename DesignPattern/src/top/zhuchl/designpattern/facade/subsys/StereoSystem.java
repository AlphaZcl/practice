package top.zhuchl.designpattern.facade.subsys;

/**
 * 子系统：音响设备
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public class StereoSystem {

    private static StereoSystem instance;

    private StereoSystem(){}

    public static StereoSystem getInstance(){
        if (instance == null) {
            synchronized (StereoSystem.class){
                if(instance == null){
                    instance = new StereoSystem();
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
