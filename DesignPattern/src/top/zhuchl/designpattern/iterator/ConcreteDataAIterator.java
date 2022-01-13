package top.zhuchl.designpattern.iterator;

import java.util.Iterator;

/**
 * 具体迭代器
 *
 * @Author AlphaZcl
 * @Date 2021/12/16
 **/
public class ConcreteDataAIterator<E> implements Iterator<E> {

    /**
     * 遍历的目标
     */
    private E[] elements;

    /**
     * 元素当前位置指针,初始为-1
     */
    private int curPosition= -1;

    public ConcreteDataAIterator(E[] elements){
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        if(curPosition+1>=elements.length){
            return false;
        }

        return elements[curPosition+1]!=null;
    }

    @Override
    public E next() {
        if(curPosition+1>=elements.length){
            throw new IndexOutOfBoundsException();
        }
        return elements[++curPosition];
    }

    @Override
    public void remove() {
        System.out.println("迭代器消除");
    }
}
