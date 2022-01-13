package top.zhuchl.designpattern.composite.safety;

import lombok.Data;

/**
 * 树叶构件：专业部门，叶子节点
 *
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
@Data
public class DepartmentComp extends OrgComponent{

    private String name;

    private String desc;

    public DepartmentComp(){}

    public DepartmentComp(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "DepartmentComp{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
