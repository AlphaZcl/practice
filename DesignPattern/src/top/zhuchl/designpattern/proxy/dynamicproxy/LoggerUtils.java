package top.zhuchl.designpattern.proxy.dynamicproxy;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * 切面类
 *
 * @Author AlphaZcl
 * @Date 2021/12/1
 **/
public class LoggerUtils {

    public static void loggerStart(Method method, Object... obj) {
        List<Object> args = null;
        if (obj != null) {
            args = Arrays.asList(obj);
        }
        System.out.println("方法" + method.getName() + "执行了，参数：{" + args + "}");
    }

    public static void loggerReturn(Method method, Object result) {
        System.out.println("方法" + method.getName() + "返回结果：" + result);
    }

    public static void loggerException(Exception e) {
        System.out.println("执行异常，原因：" + e.getCause());
    }

    public static void loggerEnd(Method method) {
        System.out.println("方法" + method.getName() + "执行完毕");
    }
}
