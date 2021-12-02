package top.zhuchl.designpattern.adapter.objectadapter;

/**
 * 适配器：电动适配器
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class ElectricAdapter implements Motor{

    /**
     * 适配者
     */
    private ElectricMotor electricMotor;

    public ElectricAdapter(){
        this.electricMotor = new ElectricMotor();
    }

    @Override
    public String driver() {
        System.out.println("电能适配器");
        return electricMotor.electricDrive();
    }
}
