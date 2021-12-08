package top.zhuchl.designpattern.composite.safety;

/**
 * 抽象构件：组织结构
 *
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
public abstract class OrgComponent {

    public abstract void print();

    public boolean add(OrgComponent component) {
        throw new UnsupportedOperationException();
    }

    public OrgComponent get(int index) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(OrgComponent orgComponent){
        throw new UnsupportedOperationException();
    }
}
