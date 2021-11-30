package top.zhuchl.designpattern.factory.abstractfactory.factory;

import top.zhuchl.designpattern.factory.abstractfactory.product.noodles.Noodles;
import top.zhuchl.designpattern.factory.abstractfactory.product.pastry.Pastry;

/**
 * 抽象方法接口：食品接口
 *
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public interface FoodFactory {

    /**
     * 生产糕点
     * @return
     */
    Pastry newPastry();

    /**
     * 生产面条
     * @return
     */
    Noodles newNoodles();
}
