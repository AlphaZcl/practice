package test.designpattern.proxy;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.proxy.dynamicproxy.cglib.CalculateDao;
import top.zhuchl.designpattern.proxy.dynamicproxy.cglib.CglibProxyInterceptor;
import top.zhuchl.designpattern.proxy.dynamicproxy.jdkproxy.CalculateServiceImpl;
import top.zhuchl.designpattern.proxy.dynamicproxy.jdkproxy.CalculatorProxyFactory;
import top.zhuchl.designpattern.proxy.dynamicproxy.jdkproxy.ICalculateService;
import top.zhuchl.designpattern.proxy.staticproxy.ITeacher;
import top.zhuchl.designpattern.proxy.staticproxy.ProxyTeacher;
import top.zhuchl.designpattern.proxy.staticproxy.RealTeacher;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @ArgumentsSource(MyArgumentProvider.class)
    @DisplayName("动态代理")
    public void testDynamicProxy(Object target){
        Object proxyInstance = CalculatorProxyFactory.newProxyInstance(target);
        Assumptions.assumingThat(proxyInstance instanceof ITeacher,()->{
            ((ITeacher)proxyInstance).teach();
        });
        Assumptions.assumingThat(proxyInstance instanceof ICalculateService,()->{
            ICalculateService calculateService = (ICalculateService) proxyInstance;
            calculateService.add(1,2,2);
            calculateService.sub(1,2,2);
            calculateService.mul(2.1,3.2,2);
            calculateService.div(6,2.5,2);
        });
    }

    static class MyArgumentProvider implements ArgumentsProvider{

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(new RealTeacher(),new CalculateServiceImpl()).map(Arguments::of);
        }
    }

    @Test
    @DisplayName("cglib动态代理")
    public void testDynamicProxyCglib(){
        Object proxyInstance = new CglibProxyInterceptor(new CalculateDao()).getProxyInstance();
        System.out.println(proxyInstance.getClass().getName());
        int result = ((CalculateDao) proxyInstance).add(1, 2);
        System.out.println(result);
    }

}
