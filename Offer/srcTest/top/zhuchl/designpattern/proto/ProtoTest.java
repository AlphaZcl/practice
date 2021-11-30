package top.zhuchl.designpattern.proto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
public class ProtoTest {

    @Test
    public void test1() throws CloneNotSupportedException {
        ProtoTypeManager protoTypeManager = new ProtoTypeManager();
        ProtoTypeCircle circle = new ProtoTypeCircle("圆形", 3);
        ProtoTypeSquare square = new ProtoTypeSquare("矩形", 2, 3);
        protoTypeManager.addShape("Circle",circle);
        protoTypeManager.addShape("Square",square);
        ProtoTypeShape circle1 = protoTypeManager.getShape("Circle");
        assertFalse(circle1==circle);
        System.out.println("circle.area："+circle1.countArea(3));
        System.out.println("circle1.area："+circle1.countArea(3));
        ProtoTypeShape square1 = protoTypeManager.getShape("Square");
        assertFalse(square1==square);
        System.out.println("square.area："+square.countArea(2));
        System.out.println("square1.area："+square1.countArea(2));

    }
}
