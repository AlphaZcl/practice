package top.zhuchl.designpattern.visitor.simple;

/**
 * 抽象访问者
 *
 * @Author AlphaZcl
 * @Date 2021/12/17
 **/
public interface Action {

    /**
     * 操作man元素的访问方法
     * @param man
     * @return
     */
    String getManResult(Man man);

    /**
     * 操作woman元素的访问方法
     * @param woman
     * @return
     */
    String getWomanResult(Woman woman);
}
