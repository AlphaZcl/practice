package top.zhuchl.designpattern.factory.factorymethod.factory;

import top.zhuchl.designpattern.factory.factorymethod.product.AbstractNoodle;

/**
 * 工厂抽象类
 *
 * @Author AlphaZcl
 * @Date 2021/11/27
 **/
public interface FoodFactory {

    /**
     *  生产食物
     * @param type 产品类型
     * @return 返回一个食品对象
     */
    public abstract AbstractNoodle process(String type);
}
