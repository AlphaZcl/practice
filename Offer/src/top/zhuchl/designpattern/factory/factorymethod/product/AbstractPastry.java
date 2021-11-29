package top.zhuchl.designpattern.factory.factorymethod.product;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public abstract class AbstractPastry {

    /**
     * 处理面点
     * @param materials 面点材料
     */
    public abstract void process(String materials);

}
