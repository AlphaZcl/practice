package top.zhuchl.designpattern.factory.abstractfactory.product.noodles;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public class YouPoNoodle extends Noodles{
    @Override
    public void doProcess(String materials) {
        System.out.println("油泼面制作，材料："+materials);
    }
}
