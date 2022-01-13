package top.zhuchl.designpattern.mediator;

/**
 * 具体同事类
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
public class Seller extends Customer{

    public Seller(String name){
        super(name);
    }

    @Override
    public void sendMessage(String to,String ad) {
        System.out.println("卖方给出的信息："+ad);
        Medium medium = getMedium();
        //中介者转发
        medium.replay(to,ad);
    }

    @Override
    public void receiveMessage(String ad) {
        System.out.println("卖方收到的信息："+ad);
    }
}
