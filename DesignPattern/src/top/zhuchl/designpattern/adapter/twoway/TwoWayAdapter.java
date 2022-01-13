package top.zhuchl.designpattern.adapter.twoway;

/**
 * 双向适配器
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class TwoWayAdapter implements TwoWayAdaptee,TwoWayTarget{

    private TwoWayTarget target;

    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target){
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public String specificRequest(String arg) {
        System.out.println("适配器处理");
        target.request(arg);
        return arg;
    }

    @Override
    public String request(String arg) {
        System.out.println("适配器处理");
        adaptee.specificRequest(arg);
        return arg;
    }
}
