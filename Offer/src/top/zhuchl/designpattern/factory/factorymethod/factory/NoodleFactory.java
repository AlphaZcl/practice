package top.zhuchl.designpattern.factory.factorymethod.factory;

import top.zhuchl.designpattern.factory.constant.NoodleEnum;
import top.zhuchl.designpattern.factory.factorymethod.product.AbstractNoodle;
import top.zhuchl.designpattern.factory.factorymethod.product.Noodle;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public class NoodleFactory implements FoodFactory{
    @Override
    public AbstractNoodle process(String type) {
        AbstractNoodle food = null;
        NoodleEnum noodleEnum = NoodleEnum.getNoodlesByType(type);
        if(noodleEnum == null){
            return null;
        }
        switch (noodleEnum){
            case HOT_DRY_NOODLE:
                food = new Noodle();
                food.prepare("WHhAN HOT-DRY-NOODLE materials");
                break;
            case YOU_PO_NOODLE:
                food = new Noodle();
                food.prepare("SteamedBun's materials");
                break;
            default:
                System.out.println("THERE ARE NO NOODLES LIKE THIS TYPE : " + type);
                break;
        }
        return food;
    }
}
