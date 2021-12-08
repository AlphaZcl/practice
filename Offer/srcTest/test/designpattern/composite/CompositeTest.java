package test.designpattern.composite;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.composite.luency.Commodity;
import top.zhuchl.designpattern.composite.luency.Composite;
import top.zhuchl.designpattern.composite.luency.Goods;
import top.zhuchl.designpattern.composite.safety.College;
import top.zhuchl.designpattern.composite.safety.DepartmentComp;
import top.zhuchl.designpattern.composite.safety.OrgComponent;
import top.zhuchl.designpattern.composite.safety.University;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
public class CompositeTest {

    @Test
    @DisplayName("组合模式")
    public void testLucencyComposite(){
        Commodity composite1 = new Composite();
        Commodity toothPaste = new Goods(2,18.5,"牙膏");
        Commodity toothBrush = new Goods(2,12,"牙刷");
        assertThrows(UnsupportedOperationException.class,()->{toothBrush.add(toothPaste);},"居然成功了");
        composite1.add(toothPaste);
        composite1.add(toothBrush);
        double calculation = composite1.calculation();
        System.out.println(calculation);
    }

    @Test
    @DisplayName("复杂组合模式")
    public void testSafetyComposite(){
        OrgComponent university = new University("HZAU","帝国种地大学");

        OrgComponent college1 = new College("工学院","开拖拉机的");
        OrgComponent college2 = new College("生科院","养殖种树的");

        OrgComponent departmentComp1 = new DepartmentComp("机械化", "修拖拉机");
        OrgComponent departmentComp2 = new DepartmentComp("自动化", "自动修拖拉机");
        OrgComponent departmentComp3 = new DepartmentComp("生物工程", "做药");
        OrgComponent departmentComp4 = new DepartmentComp("环境保护", "环保");

        university.add(college1);
        university.add(college2);

        college1.add(departmentComp1);
        college1.add(departmentComp2);
        college2.add(departmentComp3);
        college2.add(departmentComp4);

        university.print();
    }
}
