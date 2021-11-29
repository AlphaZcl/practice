package top.zhuchl.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import top.zhuchl.designpattern.factory.constant.NoodleEnum;
import top.zhuchl.designpattern.factory.factorymethod.factory.AbstractNoodleFactory;
import top.zhuchl.designpattern.factory.factorymethod.factory.HotDryNoodleFactory;
import top.zhuchl.designpattern.factory.factorymethod.factory.YouPoNoodleFactory;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
@DisplayName("工厂方法模式")
public class AbstractFactoryTest {

    @ParameterizedTest
    @ValueSource(strings = {"W01","W02","W03"})
    public void test1(String type){
        NoodleEnum noodleEnum = NoodleEnum.getNoodlesByType(type);
        AbstractNoodleFactory noodleFactory = null;
        if(noodleEnum == null){
            System.out.println("THERE ARE NO NOODLES LIKE THIS TYPE : " + type);
            return ;
        }
        switch (noodleEnum){
            case HOT_DRY_NOODLE:
                noodleFactory = new HotDryNoodleFactory();
                break;
            case YOU_PO_NOODLE:
                noodleFactory = new YouPoNoodleFactory();
                break;
            default:
                break;
        }
        noodleFactory.process();
    }
}
