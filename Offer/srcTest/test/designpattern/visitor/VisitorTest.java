package test.designpattern.visitor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.visitor.simple.*;

/**
 *
 * @Author AlphaZcl
 * @Date 2021/12/19
 **/
@DisplayName("访问者模式")
public class VisitorTest {

    @Test
    @DisplayName("简单访问者模式")
    public void testVisitorSimple(){
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Man());
        objectStructure.add(new Woman());

        //访问者
        System.out.println(objectStructure.display(new Success()));
        System.out.println("==========");
        System.out.println(objectStructure.display(new Fail()));
    }


}
