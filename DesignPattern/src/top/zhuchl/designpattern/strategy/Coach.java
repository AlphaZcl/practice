package top.zhuchl.designpattern.strategy;

/**
 * 具体策略类
 *
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
public class Coach extends TripMode{

    public Coach(String tripName){
        this.tripName = tripName;
    }

    @Override
    public String getOut() {
        return tripName;
    }

    @Override
    public String getIn() {
        return tripName;
    }
}
