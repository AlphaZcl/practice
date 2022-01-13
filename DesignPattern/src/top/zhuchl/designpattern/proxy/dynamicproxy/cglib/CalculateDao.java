package top.zhuchl.designpattern.proxy.dynamicproxy.cglib;

/**
 * 真实模型：被代理对象类
 *
 * @Author AlphaZcl
 * @Date 2021/12/1
 **/
public class CalculateDao {

    public int add(int a,int b){
        return a + b;
    }
}
