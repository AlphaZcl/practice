package top.zhuchl.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.singleton.Singleton8;

/**
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public class SingletonTest {

    @Test
    @DisplayName("枚举方式")
    public void test1(){
        Singleton8 instacne = Singleton8.INSTACNE;
        Singleton8 instacne1 = Singleton8.INSTACNE;
        System.out.println(instacne == instacne1);
        System.out.println(instacne.hashCode());
        System.out.println(instacne1.hashCode());
    }
}
