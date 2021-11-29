package top.zhuchl.designpattern.factory.factorymethod.product;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public class SteamedBun extends AbstractPastry {

    @Override
    public void process(String materials) {
        System.out.println("处理面点材料"+materials);
    }
}
