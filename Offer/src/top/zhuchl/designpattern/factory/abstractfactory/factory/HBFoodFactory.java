package top.zhuchl.designpattern.factory.abstractfactory.factory;

import top.zhuchl.designpattern.factory.abstractfactory.product.noodles.HotDryNoodle;
import top.zhuchl.designpattern.factory.abstractfactory.product.noodles.Noodles;
import top.zhuchl.designpattern.factory.abstractfactory.product.pastry.Pastry;
import top.zhuchl.designpattern.factory.abstractfactory.product.pastry.SteamedBun;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public class HBFoodFactory implements FoodFactory{
    @Override
    public Pastry newPastry() {
        SteamedBun steamedBun = new SteamedBun();
        steamedBun.prepare("白面");
        steamedBun.steamed();
        return steamedBun;
    }

    @Override
    public Noodles newNoodles() {
        HotDryNoodle hotDryNoodle = new HotDryNoodle();
        hotDryNoodle.doProcess("胡萝卜、榨菜、碱水面");
        hotDryNoodle.cooking();
        return hotDryNoodle;
    }
}
