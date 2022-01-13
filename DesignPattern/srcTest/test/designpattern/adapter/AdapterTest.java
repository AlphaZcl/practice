package test.designpattern.adapter;


import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.adapter.classadapter.ClassAdapter;
import top.zhuchl.designpattern.adapter.classadapter.ClassAdapterTarget;
import top.zhuchl.designpattern.adapter.interfaceadapter.Adapter;
import top.zhuchl.designpattern.adapter.objectadapter.ElectricAdapter;
import top.zhuchl.designpattern.adapter.objectadapter.Motor;
import top.zhuchl.designpattern.adapter.objectadapter.OpticalAdapter;
import top.zhuchl.designpattern.adapter.twoway.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
@DisplayName("适配器模式")
public class AdapterTest {

    @Test
    @DisplayName("类适配器模式")
    public void testClassAdapter(){
        ClassAdapterTarget adapterTarget = new ClassAdapter();
        int dstRes = adapterTarget.request();
        assertEquals(5,dstRes,"适配失败");
    }

    @ParameterizedTest
    @ArgumentsSource(MyArgumentsProvider.class)
    @DisplayName("对象适配器模式")
    public void testObjectAdapter(Motor adapter){
        String driver = adapter.driver();
        System.out.println(driver);
    }

    static class MyArgumentsProvider implements ArgumentsProvider{

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(new ElectricAdapter(),new OpticalAdapter()).map(Arguments::of);
        }
    }

    @Test
    @DisplayName("接口适配器模式")
    public void testInterfaceAdapterTest(){
        Adapter adapter = new Adapter();
        adapter.request2();
        adapter.request3();
    }

    @ParameterizedTest
    @ArgumentsSource(CustArgumentsProvider.class)
    @DisplayName("双向适配模式")
    public void testTwoWayAdapterTest(Object obj){
        Assumptions.assumingThat(obj instanceof TwoWayTarget,()->{
            TwoWayAdapter twoWayAdapter = new TwoWayAdapter((TwoWayTarget)obj);
            String s = twoWayAdapter.specificRequest("目标接口适配适配者接口");
            System.out.println(s);
        });

        Assumptions.assumingThat(obj instanceof TwoWayAdaptee,()->{
            TwoWayAdapter twoWayAdapter = new TwoWayAdapter((TwoWayAdaptee) obj);
            String s = twoWayAdapter.request("适配者接口适配目标接口");
            System.out.println(s);
        });
    }

    static class CustArgumentsProvider implements ArgumentsProvider{

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(new AdapteeRealize(),new TargetRealize()).map(Arguments::of);
        }
    }
}
