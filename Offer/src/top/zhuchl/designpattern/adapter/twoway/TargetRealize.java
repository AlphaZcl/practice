package top.zhuchl.designpattern.adapter.twoway;

/**
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class TargetRealize implements TwoWayTarget{
    @Override
    public String request(String arg) {
        System.out.println("目标代码执行");
        return arg;
    }
}
