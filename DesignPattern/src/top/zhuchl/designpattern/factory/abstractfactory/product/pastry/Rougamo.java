package top.zhuchl.designpattern.factory.abstractfactory.product.pastry;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public class Rougamo extends Pastry{
    @Override
    public void prepare(String materials) {
        System.out.println("准备包子的材料：" + materials);
    }
}
