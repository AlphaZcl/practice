package top.zhuchl.designpattern.facade;

import top.zhuchl.designpattern.facade.subsys.NetworkSystem;
import top.zhuchl.designpattern.facade.subsys.ScreenSystem;
import top.zhuchl.designpattern.facade.subsys.StereoSystem;

/**
 * 具体外观:TV外观
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public class TVModeFacade extends AbsHomeTheaterFacade {

    private NetworkSystem networkSystem;

    private ScreenSystem screenSystem;

    private StereoSystem stereoSystem;

    public TVModeFacade(){
        networkSystem = NetworkSystem.getInstance();
        screenSystem = ScreenSystem.getInstance();
        stereoSystem = StereoSystem.getInstance();
    }

    @Override
    public void modeOn() {
        networkSystem.turnOn();
        screenSystem.turnOn();
        stereoSystem.turnOn();
    }

    @Override
    public void modeOff() {
        networkSystem.turnOff();
        screenSystem.turnOff();
        stereoSystem.turnOff();
    }
}
