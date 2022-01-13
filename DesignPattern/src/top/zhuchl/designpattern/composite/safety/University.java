package top.zhuchl.designpattern.composite.safety;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件：大学-对学院进行管理
 *
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
public class University extends OrgComponent {

    /**
     * 子构件(学院)管理容器
     */
    private List<OrgComponent> colleges = new ArrayList<>();

    protected String name;

    protected String desc;

    public University(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    @Override
    public boolean add(OrgComponent component) {
        if (component == null){
            throw new RuntimeException("添加为空");
        }
        colleges.add(component);
        return true;
    }

    @Override
    public OrgComponent get(int index) {
        OrgComponent orgComponent = colleges.get(index);
        return orgComponent;
    }

    @Override
    public boolean remove(OrgComponent orgComponent){
        boolean remove = colleges.remove(orgComponent);
        return remove;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
        colleges.stream().forEach(OrgComponent::print);
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
