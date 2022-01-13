package top.zhuchl.designpattern.interpreter;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * 终结符表达式：构成句子的最小单位
 *
 * @Author AlphaZcl
 * @Date 2021/12/22
 **/
public class TerminalExpression implements AbsExpression{

    /**
     * 终结符表
     */
    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data){
        Stream.of(data).forEach(str -> {
            set.add(str);
        });
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
