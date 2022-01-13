package top.zhuchl.designpattern.factory.abstractfactory.product.pastry;

/**
 * 产品抽象类：糕点
 *
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public abstract class Pastry {

    public abstract void prepare(String materials);

    public void steamed(){
        System.out.println("蒸熟。。。。");
    }
}
