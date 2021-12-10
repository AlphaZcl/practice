package test.designpattern.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.command.*;
import top.zhuchl.designpattern.command.decorator.ExtendHttpCommand;
import top.zhuchl.designpattern.command.decorator.ExtendHttpReqService;

import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
@DisplayName("命令模式")
public class CommandTest {

    @ParameterizedTest
    @ArgumentsSource(CommandArgumentsProvider.class)
    @DisplayName("简洁命令模式")
    public void testCommandSimple(ServiceCommand command) {
        ReqInvoker reqInvoker = new ReqInvoker();
        reqInvoker.setCommand(command);
        System.out.println(reqInvoker.doInvoke("reqParam"));
    }

    static class CommandArgumentsProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(new HttpReqCommand(new HttpReqHandler()), new TcpReqCommand(new TcpReqHandler())).map(Arguments::of);
        }
    }

    @Test
    @DisplayName("装饰者模式扩展")
    public void testDecoratorCommand() {
        ExtendHttpCommand extendHttpCommand = new ExtendHttpReqService(new HttpReqCommand(new HttpReqHandler()));
        String execute = extendHttpCommand.execute("                        reqParam");
        System.out.println(execute);
    }
}
