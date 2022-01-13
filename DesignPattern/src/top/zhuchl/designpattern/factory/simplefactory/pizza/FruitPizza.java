package top.zhuchl.designpattern.factory.simplefactory.pizza;

/**
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public class FruitPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("水果pizza准备原材料");
    }
}
