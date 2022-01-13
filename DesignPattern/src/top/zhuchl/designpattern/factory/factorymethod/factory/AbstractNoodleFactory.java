package top.zhuchl.designpattern.factory.factorymethod.factory;

import top.zhuchl.designpattern.factory.factorymethod.product.AbstractNoodle;

/**
 * 工厂抽象类
 *
 * @Author AlphaZcl
 * @Date 2021/11/27
 **/
public abstract class AbstractNoodleFactory {

    /**
     *  生产食物
     * @return 返回一个面条对象
     */
    public abstract AbstractNoodle process();
}
