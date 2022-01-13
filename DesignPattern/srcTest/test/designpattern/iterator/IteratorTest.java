package test.designpattern.iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import top.zhuchl.designpattern.iterator.AggregationData;
import top.zhuchl.designpattern.iterator.ConcreteDataA;
import top.zhuchl.designpattern.iterator.ConcreteDataB;
import top.zhuchl.designpattern.iterator.pojo.UnitElement;

import java.util.Iterator;
import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2021/12/15
 **/
@DisplayName("迭代器模式")
public class IteratorTest {

    @ParameterizedTest
    @ArgumentsSource(IteratorArgumentsProvider.class)
    @DisplayName("迭代器测试")
    public void testIterator(AggregationData<UnitElement> contains){
        UnitElement unitElement1 = new UnitElement("数据1", "测试数据1");
        UnitElement unitElement2 = new UnitElement("数据2", "测试数据2");
        UnitElement unitElement3 = new UnitElement("数据3", "测试数据3");

        contains.add(unitElement1);
        contains.add(unitElement2);
        contains.add(unitElement3);
        Iterator iterator = contains.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println(contains.size());
        }
    }

    static class IteratorArgumentsProvider implements ArgumentsProvider{

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            AggregationData<UnitElement> concreteDataA = new ConcreteDataA<>("聚合容器类A");
            AggregationData<UnitElement> concreteDataB = new ConcreteDataB<>("聚合容器类B");
            return Stream.of(concreteDataA,concreteDataB).map(Arguments::of);
        }
    }
}
