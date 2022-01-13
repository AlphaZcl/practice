package top.zhuchl.designpattern.visitor.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构:包含元素角色集合，提供元素访问方法，方法传入访问者进行元素的访问
 *
 * @Author AlphaZcl
 * @Date 2021/12/17
 **/
public class ObjectStructure {
    List<Person> pList = new ArrayList<>();

    public void add(Person p){
        pList.add(p);
    }

    public void remove(Person p){
        pList.remove(p);
    }

    /**
     * 对元素进行访问
     * @param action 观察者对象
     * @return
     */
    public String display(Action action){
        StringBuilder builder = new StringBuilder();
        Iterator<Person> iterator = pList.iterator();
        while(iterator.hasNext()){
            Person next = iterator.next();
            String accept = next.accept(action);
            builder.append(accept);
            if(iterator.hasNext()){
                builder.append(",\t");
            }
        }
        return builder.toString();
    }
}
