package top.zhuchl.designpattern.adapter;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.adapter.classadapter.ClassAdapter;
import top.zhuchl.designpattern.adapter.classadapter.ClassAdapterTarget;

import static org.junit.jupiter.api.Assertions.*;

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
}
