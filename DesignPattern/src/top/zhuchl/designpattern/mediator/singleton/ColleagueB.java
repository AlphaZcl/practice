package top.zhuchl.designpattern.mediator.singleton;

/**
 * 具体同事类
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
public class ColleagueB extends Colleague{

    public ColleagueB(String name){
        super(name);
        ConcreteMediator.getInstance().register(this);
    }

    @Override
    public void sendMessage(String to, String ad) {
        System.out.println(this.getName()+"\t发送信息："+ad + "\t到"+to);
        //中介者转发
        ConcreteMediator.getInstance().replay(to,ad);
    }

    @Override
    public void receive(String ad) {
        System.out.println(this.getName()+"\t接受信息："+ad);
    }
}
