package top.zhuchl.designpattern.mediator.singleton;

import lombok.Data;

/**
 * 抽象同事类
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
@Data
public abstract class Colleague {

    private String name;

    public Colleague(){}

    public Colleague(String name){
        this.name = name;
    }

    /**
     * 发送信息
     * @param to 发送目标名称
     * @param ad 发送信息
     */
    public abstract void sendMessage(String to,String ad);

    /**
     * 接受信息
     * @param ad 接受的信息
     */
    public abstract void receive(String ad);
}
