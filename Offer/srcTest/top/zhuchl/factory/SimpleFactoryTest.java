package top.zhuchl.factory;


import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import top.zhuchl.designpattern.factory.simplefactory.DefaultPizzaSimpleFactory;
import top.zhuchl.designpattern.factory.simplefactory.pizza.Pizza;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public class SimpleFactoryTest {

    @ParameterizedTest
    @DisplayName("简单工厂测试")
    @ValueSource(strings = {"001","002","003"})
    public void test1(String code){
//        DefaultPizzaSimpleFactory defaultPizzaSimpleFactory = new DefaultPizzaSimpleFactory();
//        Pizza pizza1 = defaultPizzaSimpleFactory.createPizza1(code);
        Pizza pizza1 = DefaultPizzaSimpleFactory.createPizza2(code);
        Assumptions.assumingThat(pizza1 != null, ()->{
                    pizza1.prepare();
                    pizza1.bake();
                    pizza1.cut();
                    pizza1.pack();});
    }
}
