package top.zhuchl.designpattern.observer;

/**
 * 抽象观察者：公司
 *
 * @Author AlphaZcl
 * @Date 2021/12/13
 **/
public abstract class Company {

    /**
     * 汇率值变更值
     */
    protected int rateValue;

    public int getRateValue(){
        return this.rateValue = rateValue >0 ? rateValue : -rateValue;
    }

    /**
     * 自我更新方法，接受更改通知时调用
     *
     * @param number
     */
    public abstract void updateData(int number);
}
