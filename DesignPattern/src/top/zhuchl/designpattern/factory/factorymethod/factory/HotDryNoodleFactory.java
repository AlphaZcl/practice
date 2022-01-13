package top.zhuchl.designpattern.factory.factorymethod.factory;

import top.zhuchl.designpattern.factory.factorymethod.product.HotDryNoodle;
import top.zhuchl.designpattern.factory.factorymethod.product.AbstractNoodle;

/**
 * 热干面工厂子类
 *
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public class HotDryNoodleFactory extends AbstractNoodleFactory {
    @Override
    public AbstractNoodle process() {
        HotDryNoodle noodle = new HotDryNoodle();
        noodle.prepare("WHhAN HOT-DRY-NOODLE materials");
        noodle.cookNoodle();
        return noodle;
    }
}
