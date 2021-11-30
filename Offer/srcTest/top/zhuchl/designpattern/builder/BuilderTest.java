package top.zhuchl.designpattern.builder;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.buildermode.builder.AbstractBuilder;
import top.zhuchl.designpattern.buildermode.builder.CommonBuilder;
import top.zhuchl.designpattern.buildermode.builder.HighBuilder;
import top.zhuchl.designpattern.buildermode.director.HouseDirector;
import top.zhuchl.designpattern.buildermode.product.House;

import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
public class BuilderTest {

    @ParameterizedTest
    @ArgumentsSource(MyArgumentsProvider.class)
    public void test1(AbstractBuilder builder){
        HouseDirector houseDirector = new HouseDirector(builder);
        House house = houseDirector.constructHouse();
        System.out.println(house.toString());
    }

    static class MyArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream< ? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(new CommonBuilder(),new HighBuilder()).map(Arguments::of);
        }
    }
}
