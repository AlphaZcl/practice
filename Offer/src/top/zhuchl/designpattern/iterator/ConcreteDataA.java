package top.zhuchl.designpattern.iterator;

import java.util.Iterator;

/**
 * 具体聚合类A：定义具体数据单元容器，实现接口方法
 *
 * @Author AlphaZcl
 * @Date 2021/12/15
 **/
public class ConcreteDataA<E> implements AggregationData<E> {

    /**
     * 保存单元数据的容器
     */
    private E[] elements;

    /**
     * 单元数据容器内已有元素数
     */
    private int curNumOfElement = 0;

    /**
     * 初始容积
     */
    public static final int CAPACITY = 10;

    /**
     * 聚合对象名称
     */
    private String name;

    public ConcreteDataA(String name){
        this(name,CAPACITY);
    }

    public ConcreteDataA(String name, int capacity){
        this.name = name;
        elements = (E[]) new Object[capacity];
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void add(E e) {
        if(curNumOfElement>=elements.length){
            throw new IndexOutOfBoundsException();
        }
        elements[curNumOfElement]=e;
        curNumOfElement++;
    }

    @Override
    public Iterator getIterator() {
        //创建自定义迭代器
        return new ConcreteDataAIterator(this.elements);
    }

    @Override
    public int size(){
        return elements.length;
    }
}
