package top.zhuchl.designpattern.mediator;

import lombok.Data;

/**
 * 抽象同事对象
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
@Data
public abstract class Customer {

    /**
     * 中介者对象
     */
    private Medium medium;

    /**
     * 同事对象名称：确定具体同事的key
     */
    private String name;

    public Customer(){}

    public Customer(String name){
        this.name = name;
    }

    /**
     * 同事对象交互方法：发送信息
     * @param ad 请求信息
     * @param to 目标同事对象
     */
    public abstract void sendMessage(String to,String ad);

    /**
     * 同事对象交互方法：获取信息
     * @param ad 请求信信
     */
    public abstract void receiveMessage(String ad);
}
