package top.zhuchl.designpattern.adapter.objectadapter;

/**
 * 适配者：电力驱动
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class ElectricMotor {

    public String electricDrive(){
        System.out.println("电动发动机");
        return "electric";
    }
}
