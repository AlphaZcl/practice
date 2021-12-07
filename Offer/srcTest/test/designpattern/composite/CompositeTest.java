package test.designpattern.composite;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.composite.luency.Commodity;
import top.zhuchl.designpattern.composite.luency.Composite;
import top.zhuchl.designpattern.composite.luency.Goods;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
public class CompositeTest {

    @Test
    @DisplayName("组合模式")
    public void testComposite(){
        Commodity composite1 = new Composite();
        Commodity toothPaste = new Goods(2,18.5,"牙膏");
        Commodity toothBrush = new Goods(2,12,"牙刷");
        assertThrows(UnsupportedOperationException.class,()->{toothBrush.add(toothPaste);},"居然成功了");
        composite1.add(toothPaste);
        composite1.add(toothBrush);
        double calculation = composite1.calculation();
        System.out.println(calculation);
    }
}
