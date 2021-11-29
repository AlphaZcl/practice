package top.zhuchl.designpattern.factory.simplefactory.pizza;

import top.zhuchl.designpattern.factory.constant.PizzaEnum;

/**
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public class SeafoodPizza extends Pizza{

    @Override
    public void prepare() {
        setPizzaName(PizzaEnum.SEAFOOD_PIZZA.getPizzaName());
        System.out.println("海鲜pizza准备原材料");
    }
}
