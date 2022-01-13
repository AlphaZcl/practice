package top.zhuchl.designpattern.factory.simplefactory;

import top.zhuchl.designpattern.factory.simplefactory.pizza.CheesePizza;
import top.zhuchl.designpattern.factory.simplefactory.pizza.FruitPizza;
import top.zhuchl.designpattern.factory.simplefactory.pizza.Pizza;
import top.zhuchl.designpattern.factory.constant.PizzaEnum;
import top.zhuchl.designpattern.factory.simplefactory.pizza.SeafoodPizza;


/**
 * 简单工厂方法
 *
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public class DefaultPizzaSimpleFactory {

    public Pizza createPizza1(String code){
        Pizza pizza = null;
        PizzaEnum pizzaEnum = PizzaEnum.getPizzaType(code);
        if(pizzaEnum == null){
            return null;
        }
        switch (pizzaEnum){
            case SEAFOOD_PIZZA:
                pizza = new SeafoodPizza();
                pizza.setPizzaName(PizzaEnum.SEAFOOD_PIZZA.getPizzaName());
                break;
            case CHEESE_PIZZA:
                pizza = new CheesePizza();
                pizza.setPizzaName(PizzaEnum.CHEESE_PIZZA.getPizzaName());
                break;
            case FRUIT_PIZZA:
                pizza = new FruitPizza();
                pizza.setPizzaName(PizzaEnum.FRUIT_PIZZA.getPizzaName());
                break;
            default:
                System.out.println("无对应pizza类型");
        }
        return pizza;
    }

    public static Pizza createPizza2(String code){
        Pizza pizza = null;
        PizzaEnum pizzaEnum = PizzaEnum.getPizzaType(code);
        if(pizzaEnum == null){
            return null;
        }
        switch (pizzaEnum){
            case SEAFOOD_PIZZA:
                pizza = new SeafoodPizza();
                pizza.setPizzaName(PizzaEnum.SEAFOOD_PIZZA.getPizzaName());
                break;
            case CHEESE_PIZZA:
                pizza = new CheesePizza();
                pizza.setPizzaName(PizzaEnum.CHEESE_PIZZA.getPizzaName());
                break;
            case FRUIT_PIZZA:
                pizza = new FruitPizza();
                pizza.setPizzaName(PizzaEnum.FRUIT_PIZZA.getPizzaName());
                break;
            default:
                System.out.println("无对应pizza类型");
        }
        return pizza;
    }
}
