package top.zhuchl.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类：汇率
 *
 * @Author AlphaZcl
 * @Date 2021/12/13
 **/
public abstract class Rate {

    /**
     * 观察者对象容器
     */
    protected List<Company> observers = new ArrayList<>(20);

    /**
     * 注册观察者
     *
     * @param company
     */
    public void register(Company company){
        observers.add(company);
    }

    /**
     * 移除观察者
     *
     * @param company
     */
    public void remove(Company company){
        observers.remove(company);
    }

    /**
     * 通知各个观察者
     * @param number
     */
    public abstract void notifyObservers(int number);

}
