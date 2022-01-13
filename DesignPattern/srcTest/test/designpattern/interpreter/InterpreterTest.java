package test.designpattern.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import top.zhuchl.designpattern.interpreter.Context;

import java.util.Stack;

/**
 * @Author AlphaZcl
 * @Date 2021/12/21
 **/
@DisplayName("解释器模式")
public class InterpreterTest {

    @ParameterizedTest
    @ValueSource(strings = {"武汉的老人","武汉的学生","武汉的上班族","孝感的老人","孝感的学生","孝感的上班族"})
    @DisplayName("解释器模式")
    public void testInterpreter(String info){
        Context context = new Context();
        String s = context.runFreeRide(info);
        System.out.println(s);
    }
}
