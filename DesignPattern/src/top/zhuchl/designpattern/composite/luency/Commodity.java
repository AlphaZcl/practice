package top.zhuchl.designpattern.composite.luency;

/**
 * 抽象构件：顶层接口，定义组合模式的基本方法
 *
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
public interface Commodity {

    /**
     * 默认行为：计算商品价格
     *
     * @return
     */
    double calculation();

    /**
     * 对子类的管理操作：商品添加
     *
     * @return
     */
    boolean add(Commodity commodity);

    /**
     * 对子类的获取管理操作：商品信息获取
     * @return
     */
    Commodity get(int index);

    /**
     * 对子类的获取管理操作：商品删除
     *
     * @return
     */
    boolean remove(Commodity commodity);
}
