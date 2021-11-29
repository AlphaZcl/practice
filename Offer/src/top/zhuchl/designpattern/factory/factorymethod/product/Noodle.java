package top.zhuchl.designpattern.factory.factorymethod.product;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public class Noodle extends AbstractNoodle {

    @Override
    public void prepare(String materials) {
        System.out.println("Noodle do prepare with " + materials);
    }
}
