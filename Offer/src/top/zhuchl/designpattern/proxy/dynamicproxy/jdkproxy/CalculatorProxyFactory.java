package top.zhuchl.designpattern.proxy.dynamicproxy.jdkproxy;

import top.zhuchl.designpattern.proxy.dynamicproxy.LoggerUtils;

import java.lang.reflect.Proxy;

/**
 * 代理类工厂：动态生成代理对象
 *
 * @Author AlphaZcl
 * @Date 2021/12/1
 **/
public class CalculatorProxyFactory {

    public static Object newProxyInstance(final Object target){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        Object proxyObject = Proxy.newProxyInstance(classLoader, interfaces, (proxy, method, args) -> {
            Object result = null;
            try {
                System.out.println(proxy.getClass().getName());
                LoggerUtils.loggerStart(method,args);
                result = method.invoke(target,args);
                LoggerUtils.loggerReturn(method,result);
            } catch (Exception e){
                e.printStackTrace();
                LoggerUtils.loggerException(e);
            } finally {
                LoggerUtils.loggerEnd(method);
            }
            return result;
        });
        return proxyObject;
    }
}
