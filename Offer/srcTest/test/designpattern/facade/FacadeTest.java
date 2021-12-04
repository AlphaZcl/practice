package test.designpattern.facade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.facade.AbsHomeTheaterFacade;
import top.zhuchl.designpattern.facade.FilmModeFacade;
import top.zhuchl.designpattern.facade.TVModeFacade;

import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
@DisplayName("外观模式")
public class FacadeTest {

    @ParameterizedTest
    @ArgumentsSource(CommonArgumentsProvider.class)
    public void testFacade(AbsHomeTheaterFacade facade){
        facade.modeOn();
        facade.modeOff();
    }

    static class CommonArgumentsProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(new TVModeFacade(),new FilmModeFacade()).map(Arguments::of);
        }
    }
}
