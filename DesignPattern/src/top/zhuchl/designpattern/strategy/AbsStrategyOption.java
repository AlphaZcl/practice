package top.zhuchl.designpattern.strategy;

import lombok.Data;

/**
 * 抽象环境类
 *
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
@Data
public abstract class AbsStrategyOption {

    /**
     * 抽象策略接口引用
     */
    private TripMode tripMode;

    /**
     * 抽象策略接口
     */
    private HostelMode hostelMode;


    public String getOut(){
        String res = null;
        if(tripMode!=null){
            res = this.tripMode.getOut();
        }
        return res;
    }

    public String getIn(){
        String res = null;
        if(tripMode!=null){
            res = this.tripMode.getIn();
        }
        return res;
    }

    public String getInHotel(){
        String res = null;
        if(hostelMode!=null){
            res = hostelMode.getInHotel();
        }
        return res;
    }

    public abstract String goTo();

    public abstract String goBack();

}
