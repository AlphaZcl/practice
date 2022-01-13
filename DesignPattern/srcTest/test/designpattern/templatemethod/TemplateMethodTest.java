package test.designpattern.templatemethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;
import top.zhuchl.designpattern.templatemethod.OrmosiaSoybeanMilk;
import top.zhuchl.designpattern.templatemethod.PeanutSoybeanMilk;
import top.zhuchl.designpattern.templatemethod.SoybeanMilk;

import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
@DisplayName("模板测试方法")
public class TemplateMethodTest {

    @ParameterizedTest
    @ArgumentsSource(TemplateMethodArgumentProvider.class)
    @DisplayName("模板方法测试")
    public void testTemplateMethod(SoybeanMilk soybeanMilk){
        soybeanMilk.templateMake();
    }

    static class TemplateMethodArgumentProvider implements ArgumentsProvider{

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(new PeanutSoybeanMilk("花生"),new OrmosiaSoybeanMilk("红豆")).map(Arguments::of);
        }
    }
}
