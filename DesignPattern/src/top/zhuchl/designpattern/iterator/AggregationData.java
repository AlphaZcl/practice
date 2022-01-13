package top.zhuchl.designpattern.iterator;

import java.util.Iterator;

/**
 * 抽象聚合类：数据顶层接口，定义数据对外操作
 *
 * @Author AlphaZcl
 * @Date 2021/12/15
 **/
public interface AggregationData<E> {

    int size();

    /**
     * 添加数据元素
     * @param e
     */
    void add(E e);

    /**
     * 获取数据迭代器
     * @return
     */
    Iterator getIterator();
}
