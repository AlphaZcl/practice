package top.zhuchl.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 具体聚合类B：定义具体数据单元容器，实现接口方法
 *
 * @Author AlphaZcl
 * @Date 2021/12/16
 **/
public class ConcreteDataB<E> implements AggregationData<E>{

    /**
     * 元素容器
     */
    private List<E> eList;

    /**
     * 聚合容器名称
     */
    private String name;

    /**
     * 初始容积
     */
    public static final int CAPACITY = 20;

    public ConcreteDataB(String name){
        this(name,CAPACITY);
    }

    public ConcreteDataB(String name,int capacity){
        this.name = name;
        eList = new ArrayList<>(capacity);
    }

    @Override
    public void add(E e) {
        eList.add(e);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteDataBIterator(eList);
    }

    @Override
    public int size() {
        return eList.size();
    }
}
