package top.zhuchl.designpattern.interpreter;

import lombok.AllArgsConstructor;

/**
 * 非终结符表达式：能够推到出其他结构符号
 *
 * @Author AlphaZcl
 * @Date 2021/12/22
 **/
@AllArgsConstructor
public class AndExpression implements AbsExpression{

    private static final String AND_SYMBOL="的";

    private AbsExpression city;

    private AbsExpression person;

    @Override
    public boolean interpret(String info) {
        String[] ds = info.split(AND_SYMBOL);
        return city.interpret(ds[0]) && person.interpret(ds[1]);
    }
}
