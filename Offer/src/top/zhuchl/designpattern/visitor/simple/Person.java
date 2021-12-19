package top.zhuchl.designpattern.visitor.simple;

/**
 * 抽象元素类
 *
 * @Author AlphaZcl
 * @Date 2021/12/17
 **/
public interface Person {

    /**
     * 接受访问者访问
     * @param action
     * @return
     */
    String accept(Action action);
}
