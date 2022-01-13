package test.designpattern.memento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.memento.Caretaker;
import top.zhuchl.designpattern.memento.GameRole;

import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2021/12/19
 **/
@DisplayName("备忘录模式")
public class MementoTest {

    @ParameterizedTest
    @ArgumentsSource(MementoArgumentsProvider.class)
    @DisplayName("备忘录模式")
    public void testMemento(GameRole role) {
        //备忘录管理者
        Caretaker caretaker = new Caretaker();

        //存档
        System.out.println("存档："+role.toString());
        caretaker.saveMemento(role.createMemento());

        //数据变更
        role.setState("death");
        role.setDef(0);
        role.setVit(0);
        System.out.println("数据变更："+role.toString());

        //读档
        role.recoverFromMemento(caretaker.getMemento());
        System.out.println("读档："+role.toString());
    }

    static class MementoArgumentsProvider implements ArgumentsProvider{

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            GameRole role1 = new GameRole("001","survival",200,200);
            GameRole role2 = new GameRole("002", "bruise", 230, 150);
            return Stream.of(role1,role2).map(Arguments::of);
        }
    }
}
