package test.designpattern.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.decorator.Chocolate;
import top.zhuchl.designpattern.decorator.Coffee;
import top.zhuchl.designpattern.decorator.Drink;
import top.zhuchl.designpattern.decorator.Milk;

import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
@DisplayName("装饰者模式")
public class DecoratorTest {

    @DisplayName("decorator")
    @ParameterizedTest
    @ArgumentsSource(CustomArgumentsProvider.class)
    public void testDecorator(Drink drink) {
        System.out.println(drink.order());
        System.out.println("最终总价格：\t"+drink.sale());
    }

    static class CustomArgumentsProvider implements ArgumentsProvider{

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            Drink longBlack = new Coffee("LongBlack", 12.5, 2);
            Drink milk = new Milk(longBlack,1.5,2);
            Drink shortBlack = new Coffee("ShortBlack",10.5,2);
            Drink chocolate = new Chocolate(shortBlack,3);
            return Stream.of(longBlack,milk,shortBlack,chocolate).map(Arguments::of);
        }
    }

}
