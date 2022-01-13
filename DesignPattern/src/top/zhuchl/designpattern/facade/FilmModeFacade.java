package top.zhuchl.designpattern.facade;

import top.zhuchl.designpattern.facade.subsys.NetworkSystem;
import top.zhuchl.designpattern.facade.subsys.ProjectorSystem;
import top.zhuchl.designpattern.facade.subsys.StereoSystem;
import top.zhuchl.designpattern.facade.subsys.TheaterLightSystem;

/**
 * 具体外观：电影外观
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public class FilmModeFacade extends AbsHomeTheaterFacade {

    private NetworkSystem networkSystem;

    private ProjectorSystem projectorSystem;

    private StereoSystem stereoSystem;

    private TheaterLightSystem lightSystem;

    public FilmModeFacade(){
        networkSystem = NetworkSystem.getInstance();
        projectorSystem = ProjectorSystem.INSTANCE;
        stereoSystem = StereoSystem.getInstance();
        lightSystem = TheaterLightSystem.getInstance();
    }


    @Override
    public void modeOn() {
        networkSystem.turnOn();
        projectorSystem.turnOn();
        stereoSystem.turnOn();
        lightSystem.turnOn();
    }

    @Override
    public void modeOff() {
        networkSystem.turnOff();
        projectorSystem.turnOff();
        stereoSystem.turnOff();
        lightSystem.turnOff();
    }
}
