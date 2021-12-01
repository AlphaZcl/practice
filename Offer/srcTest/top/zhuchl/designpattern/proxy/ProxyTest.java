package top.zhuchl.designpattern.proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.proxy.staticproxy.ProxyTeacher;

/**
 * @Author AlphaZcl
 * @Date 2021/12/1
 **/
public class ProxyTest {

    @Test
    @DisplayName("静态代理")
    public void testStaticProxy(){
        ProxyTeacher proxy = new ProxyTeacher();
        proxy.teach();
    }


}
