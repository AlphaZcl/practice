package top.zhuchl.designpattern.factory.abstractfactory.factory;

import top.zhuchl.designpattern.factory.abstractfactory.product.pastry.Rougamo;
import top.zhuchl.designpattern.factory.abstractfactory.product.noodles.Noodles;
import top.zhuchl.designpattern.factory.abstractfactory.product.noodles.YouPoNoodle;
import top.zhuchl.designpattern.factory.abstractfactory.product.pastry.Pastry;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public class SXFoodFactory implements FoodFactory {
    @Override
    public Pastry newPastry() {
        Rougamo rougamo = new Rougamo();
        rougamo.prepare("肉夹馍材料");
        rougamo.steamed();
        return rougamo;
    }

    @Override
    public Noodles newNoodles() {
        YouPoNoodle youPoNoodle = new YouPoNoodle();
        youPoNoodle.doProcess("辣子、宽面");
        youPoNoodle.cooking();
        return youPoNoodle;
    }
}
