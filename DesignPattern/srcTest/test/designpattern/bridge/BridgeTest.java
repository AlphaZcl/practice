package test.designpattern.bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.bridge.AbsBagType;
import top.zhuchl.designpattern.bridge.BrandImplementor;
import top.zhuchl.designpattern.bridge.ColorImplementor;
import top.zhuchl.designpattern.bridge.bagtype.HandBag;
import top.zhuchl.designpattern.bridge.bagtype.Wallet;
import top.zhuchl.designpattern.bridge.brand.BrandGucciImpl;
import top.zhuchl.designpattern.bridge.brand.BrandLVImpl;
import top.zhuchl.designpattern.bridge.color.ColorRedImpl;
import top.zhuchl.designpattern.bridge.color.ColorYellowImpl;

import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
@DisplayName("桥接模式")
public class BridgeTest {

    @DisplayName("多维度测试")
    @ParameterizedTest
    @ArgumentsSource(MyArgumentsProvider.class)
    public void testBridge(AbsBagType bagType){
        String bagDetail = bagType.getBagDetail();
        System.out.println(bagDetail);
    }

    static class MyArgumentsProvider implements ArgumentsProvider{

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            BrandImplementor gucci = new BrandGucciImpl();
            BrandImplementor lv = new BrandLVImpl();
            ColorImplementor red = new ColorRedImpl();
            ColorImplementor yellow = new ColorYellowImpl();
            return Stream.of(new HandBag(gucci,red),new HandBag(gucci,yellow),new HandBag(lv,red),new HandBag(lv,yellow),
                    new Wallet(gucci,red),new Wallet(gucci,yellow),new Wallet(lv,red),new Wallet(lv,yellow)).map(Arguments::of);
        }
    }
}
