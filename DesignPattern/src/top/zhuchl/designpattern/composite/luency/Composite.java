package top.zhuchl.designpattern.composite.luency;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * 树枝构件角色，管理子构件（非叶子节点）
 *
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
public class Composite implements Commodity {

    /**
     * 子构件容器初始默认容量
     */
    public static final int INITIAL_CAPACITY = 20;

    /**
     * 储存管理子类构件的容器
     */
    private ArrayList<Commodity> bags = new ArrayList<>(INITIAL_CAPACITY);

    @Override
    public double calculation() {
        double total = bags.stream().mapToDouble(Commodity::calculation).sum();
        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println(format.format(total));
        return total;
    }

    @Override
    public boolean add(Commodity commodity) {
        if (commodity == null){
            throw new RuntimeException("添加为空");
        }
        bags.add(commodity);
        return true;
    }

    @Override
    public Commodity get(int index) {
        Commodity commodity = bags.get(index);
        return commodity;
    }

    @Override
    public boolean remove(Commodity commodity) {
        boolean remove = bags.remove(commodity);
        return remove;
    }
}
