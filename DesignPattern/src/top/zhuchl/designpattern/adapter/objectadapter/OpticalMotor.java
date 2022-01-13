package top.zhuchl.designpattern.adapter.objectadapter;

/**
 * 适配者：光能驱动
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class OpticalMotor {

    public String opticalDrive(){
        System.out.println("光能发动机");
        return "optical";
    }
}
