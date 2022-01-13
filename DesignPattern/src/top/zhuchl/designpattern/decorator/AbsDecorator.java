package top.zhuchl.designpattern.decorator;

/**
 * 抽象装饰角色
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public abstract class AbsDecorator implements Drink{

    protected Drink drink;

    protected double unitPrice;

    protected int num;

    protected AbsDecorator(){}

    @Override
    public double sale() {
        return drink.sale();
    }

    @Override
    public String order() {
        return drink.order();
    }

    public abstract double add();
}
