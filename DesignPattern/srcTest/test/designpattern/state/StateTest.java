package test.designpattern.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import top.zhuchl.designpattern.statemode.simple.ScoreContext;

/**
 * @Author AlphaZcl
 * @Date 2021/12/11
 **/
@DisplayName("状态模式")
public class StateTest {

   @Test
    @DisplayName("简单状态测试")
    public void testSimpleState(){
       ScoreContext context = new ScoreContext();
        context.doInvoker(30);
        context.doInvoker(60);
        context.doInvoker(75);
        context.doInvoker(90);
        context.doInvoker(95);
    }
}
