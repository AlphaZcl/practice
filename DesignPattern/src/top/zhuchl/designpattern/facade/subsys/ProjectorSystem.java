package top.zhuchl.designpattern.facade.subsys;

/**
 * 子系统：投影设备
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public enum ProjectorSystem {

    INSTANCE;

    private ProjectorSystem(){}

    public void turnOff(){
        System.out.println("ProjectorSystem off");
    }

    public void turnOn(){
        System.out.println("ProjectorSystem on");
    }

}
