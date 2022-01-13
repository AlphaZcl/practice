package top.zhuchl.designpattern.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import top.zhuchl.designpattern.proxy.dynamicproxy.LoggerUtils;

import java.lang.reflect.Method;

/**
 * 代理对象工厂：产生代理类
 *
 * @Author AlphaZcl
 * @Date 2021/12/1
 **/
public class CglibProxyInterceptor implements MethodInterceptor {
    /**
     * 目标对象：被代理对象
     */
    private Object target;

    public CglibProxyInterceptor(Object target){
        this.target = target;
    }

    /**
     * 创建代理对象
     * @return
     */
    public Object getProxyInstance() {
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        try {
            System.out.println(obj.getClass().getName());
            LoggerUtils.loggerStart(method,args);
//            result = method.invoke(target,args);
            result = methodProxy.invokeSuper(obj,args);
            LoggerUtils.loggerReturn(method,result);
        } catch (Exception e){
            LoggerUtils.loggerException(e);
            throw new Exception(e);
        } finally {
            LoggerUtils.loggerEnd(method);
        }
        return result;
    }
}
