package top.zhuchl.designpattern.memento;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理者（守护者对象）：保存游戏角色状态
 *
 * @Author AlphaZcl
 * @Date 2021/12/19
 **/
public class Caretaker {

    /**
     * 同一个对象只做一次保存
     */
    private Memento memento;

    /**
     * 备忘录容器：同一个对象保存多次状态信息
     */
    private List<Memento> mementos;

    /**
     * 多个角色保存多次
     */
    private Map<String,List<Memento>> objMementos = new HashMap<>();

    public void saveMemento(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return this.memento;
    }

}
