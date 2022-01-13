package top.zhuchl.designpattern.mediator;

/**
 * 具体同事类
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
public class Buyer extends Customer{

    public Buyer(String name){
        super(name);
    }

    @Override
    public void sendMessage(String to,String ad) {
        System.out.println("买方给出的信息："+ad);
        //中介者进行转发
        getMedium().replay(to,ad);
    }

    @Override
    public void receiveMessage(String ad) {
        System.out.println("买方接受到的信息："+ad);
    }
}
