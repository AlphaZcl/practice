package top.zhuchl.designpattern.adapter.interfaceadapter;

/**
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class Adapter extends AbsAdapter{

    private Adaptee adaptee;

    public Adapter(){
        adaptee = new Adaptee();
    }

    @Override
    public void request2() {
        System.out.println("request2");
        adaptee.specificRequest();
    }

    @Override
    public void request3() {
        System.out.println("request3");
        adaptee.specificRequest();
    }
}
