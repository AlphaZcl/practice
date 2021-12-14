package top.zhuchl.designpattern.mediator;

/**
 * 抽象中介者接口
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
public interface Medium {

    /**
     * 注册同事对象
     * @param customer 同事对象
     */
    void register(Customer customer);

    /**
     * 转发同事对象信息，中介对象的核心方法，根据得到的消息协调各个具体的同事对象，完成任务
     * @param to 转发的目标进行对象关联的依据
     * @param message 转发的信息
     */
    void replay(String to,String message);
}
