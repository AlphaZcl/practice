package test.designpattern.observer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import top.zhuchl.designpattern.observer.*;

/**
 * @Author AlphaZcl
 * @Date 2021/12/13
 **/
@DisplayName("观察者模式测试")
public class ObServerTest {

    @ParameterizedTest
    @ValueSource(ints = {10,-95,200})
    @DisplayName("观察者模式测试1")
    public void testObserver(int rate) {
        Rate cnyRate = new CNYRate();
        Company imp = new ImportCompany();
        Company exp = new ExportCompany();
        cnyRate.register(imp);
        cnyRate.register(exp);
        cnyRate.notifyObservers(rate);
        System.out.println("进口实时汇率变更："+imp.getRateValue());
        System.out.println("出口实时汇率变更："+exp.getRateValue());
    }

}
