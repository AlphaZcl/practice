package top.zhuchl.designpattern.adapter.twoway;

/**
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class AdapteeRealize implements TwoWayAdaptee{
    @Override
    public String specificRequest(String arg) {
        System.out.println("适配者代码执行");
        return arg;
    }
}
