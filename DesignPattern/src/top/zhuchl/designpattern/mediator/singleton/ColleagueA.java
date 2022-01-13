package top.zhuchl.designpattern.mediator.singleton;

/**
 * 具体同事类
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
public class ColleagueA extends Colleague{

    public ColleagueA(String name){
        super(name);
        //获取中介者注册当前同时类
        ConcreteMediator instance = ConcreteMediator.getInstance();
        instance.register(this);
    }

    @Override
    public void sendMessage(String to, String ad) {
        System.out.println(this.getName()+"\t发送信息："+ad + "\t到"+to);
        //中介转发
        ConcreteMediator instance = ConcreteMediator.getInstance();
        instance.replay(to,ad);
    }

    @Override
    public void receive(String ad) {
        System.out.println(this.getName()+"\t接受信息："+ad);
    }
}
