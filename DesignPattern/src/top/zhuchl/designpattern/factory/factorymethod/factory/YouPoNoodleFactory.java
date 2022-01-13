package top.zhuchl.designpattern.factory.factorymethod.factory;

import top.zhuchl.designpattern.factory.factorymethod.product.AbstractNoodle;
import top.zhuchl.designpattern.factory.factorymethod.product.YouPoNoodle;

/**
 * 油泼面工厂子类
 *
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public class YouPoNoodleFactory extends AbstractNoodleFactory{
    @Override
    public AbstractNoodle process() {
        YouPoNoodle noodle = new YouPoNoodle();
        noodle.prepare("YOU-PO-NOODLE materials");
        noodle.cookNoodle();
        return noodle;
    }
}
