package top.zhuchl.designpattern.observer;

/**
 * 具体目标类：人民币汇率
 *
 * @Author AlphaZcl
 * @Date 2021/12/13
 **/
public class CNYRate extends Rate{
    @Override
    public void notifyObservers(final int number) {
        //发生变动，通知所有注册的观察者进行数据修改
        observers.forEach(company -> {
            company.updateData(number);
        });
    }
}
