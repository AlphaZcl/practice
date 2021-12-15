package top.zhuchl.designpattern.mediator.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 具体中介者单例模式
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
public class ConcreteMediator {

    public static volatile ConcreteMediator instance;

    private Map<String,Colleague> contains;

    private ConcreteMediator(){
        contains = new HashMap<>();
    }

    public static ConcreteMediator getInstance(){
        if(instance == null){
            synchronized (ConcreteMediator.class){
                if(instance == null){
                    instance = new ConcreteMediator();
                }
            }
        }
        return instance;
    }

    /**
     * 注册同事类
     * @param colleague
     */
    public void register(Colleague colleague){
        String name = colleague.getName();
        if(name == null || name.length()==0){
            throw new IllegalArgumentException("同事对象名称非法：为空");
        }
        if(!contains.containsKey(name)){
            contains.put(name,colleague);
        }
    }

    /**
     * 转发交互
     * @param to
     * @param ad
     */
    public void replay(String to,String ad){
        Colleague colleague = contains.get(to);
        //目标接受
        colleague.receive(ad);
    }


}
