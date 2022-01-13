package top.zhuchl.designpattern.strategy;

/**
 * 抽象策略接口：交通方式
 *
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
public abstract class TripMode {

    protected String tripName;

    public abstract String getOut();

    public abstract String getIn();
}
