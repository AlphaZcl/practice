package test.designpattern.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.command.*;
import top.zhuchl.designpattern.command.composite.*;
import top.zhuchl.designpattern.command.decorator.ExtendHttpCommand;
import top.zhuchl.designpattern.command.decorator.ExtendHttpReqService;

import java.util.HashMap;
import java.util.Map;
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
    @DisplayName("命令-装饰者模式扩展")
    public void testDecoratorCommand() {
        ExtendHttpCommand extendHttpCommand = new ExtendHttpReqService(new HttpReqCommand(new HttpReqHandler()));
        String execute = extendHttpCommand.execute("                        reqParam");
        System.out.println(execute);
    }


    @Test
    @DisplayName("命令-组合模式扩展")
    public void testCompositeCommand(){
        CompositeInvoker invoker = new CompositeInvoker();
        //叶子节点，具体命令
        AbstractCommand tcpCommand = new CommandTcp(new ReqHandler());
        invoker.add(tcpCommand);

        AbstractCommand httpCommand = new CommandHttp(new ReqHandler());
        invoker.add(httpCommand);

        //上下文参数
        CommandContext context = new CommandContext();
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("tcpParam1","hello");
        hashMap.put("tcpParam2","world");
        context.setRequestParam(hashMap);

        //调用所有具体命令的目标方法->调用业务方法
        invoker.execute(context);
        System.out.println(context.getResponse());
    }
}
