package top.zhuchl.designpattern.factory.abstractfactory.product.noodles;

/**
 * 产品抽象类：面条
 *
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public abstract class Noodles {

    public abstract void doProcess(String materials);

    public void cooking(){
        System.out.println("煮熟了");
    }
}
