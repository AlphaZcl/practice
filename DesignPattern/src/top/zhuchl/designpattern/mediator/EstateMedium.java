package top.zhuchl.designpattern.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 具体中介者
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
public class EstateMedium implements Medium{

    /**
     * 管理同事对象的容器，协调各个同事角色之间的相互关系
     */
    private Map<String,Customer> contains = new HashMap<>(20);


    @Override
    public void register(Customer customer) {
        String name = customer.getName();
        if(name == null || name.length()==0){
            throw new IllegalArgumentException("同事对象名称非法：为空");
        }
        if(!contains.containsKey(name)){
            contains.put(name,customer);
            customer.setMedium(this);
        }
    }

    @Override
    public void replay(String to, String message) {
        //获取转发的目标对象
        Customer customer = contains.get(to);
        customer.receiveMessage(message);
    }
}
