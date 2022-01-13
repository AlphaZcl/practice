package top.zhuchl.designpattern.composite.safety;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件：学院-对专业部门进行管理
 *
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
public class College extends OrgComponent{

    private String name;

    private String desc;

    /**
     * 子构件(专业部门)管理容器
     */
    private List<OrgComponent> departments = new ArrayList<>();

    public College(String name, String desc) {
       this.name = name;
       this.desc = desc;
    }

    @Override
    public boolean add(OrgComponent component) {
        if (component == null){
            throw new RuntimeException("添加为空");
        }

        departments.add(component);
        return true;
    }

    @Override
    public OrgComponent get(int index) {
        OrgComponent department = departments.get(index);
        return department;
    }

    @Override
    public boolean remove(OrgComponent department) {
        boolean remove = departments.remove(department);
        return remove;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
        departments.stream().forEach(OrgComponent :: print);
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
