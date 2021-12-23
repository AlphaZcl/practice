package top.zhuchl.designpattern.interpreter;

/**
 * 抽象表达式角色
 *
 * @Author AlphaZcl
 * @Date 2021/12/22
 **/
public interface AbsExpression {

    /**
     * 对输入内容进行解释执行
     * @param info
     * @return
     */
    boolean interpret(String info);
}
