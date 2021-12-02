package top.zhuchl.designpattern.adapter.objectadapter;

/**
 * 适配器：光能驱动
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class OpticalAdapter implements Motor{

    private OpticalMotor opticalMotor;

    public OpticalAdapter(){
        this.opticalMotor = new OpticalMotor();
    }

    @Override
    public String driver() {
        System.out.println("光能适配器");
        return opticalMotor.opticalDrive();
    }
}
