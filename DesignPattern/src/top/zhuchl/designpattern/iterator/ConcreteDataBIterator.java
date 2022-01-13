package top.zhuchl.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 具体迭代器
 *
 * @Author AlphaZcl
 * @Date 2021/12/16
 **/
public class ConcreteDataBIterator<E> implements Iterator<E> {

    /**
     * 遍历的目标容器
     */
    private List<E> eList;

    /**
     * 元素当前位置指针,初始为-1
     */
    private int curPosition = -1;

    public ConcreteDataBIterator(List<E> eList) {
        this.eList = eList;
    }

    @Override
    public boolean hasNext() {
        if(curPosition+1 >= eList.size()){
            return false;
        }
        return eList.get(curPosition+1) != null;
    }

    @Override
    public E next() {
        return eList.get(curPosition+1);
    }

    @Override
    public void remove() {
        eList.remove(curPosition+1);
    }
}
