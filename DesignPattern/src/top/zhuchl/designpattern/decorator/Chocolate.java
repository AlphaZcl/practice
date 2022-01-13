package top.zhuchl.designpattern.decorator;

import java.math.BigDecimal;

/**
 * 具体装饰者
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public class Chocolate extends AbsDecorator{


    public Chocolate(Drink drink,double unitPrice){
        this.drink = drink;
        this.unitPrice = unitPrice;
        this.num = 1;
    }

    @Override
    public double sale() {
        return super.sale()+add();
    }

    @Override
    public String order() {
        return super.order() + "\t巧克力";
    }

    @Override
    public double add(){
        System.out.println("添加巧克力");
        return new BigDecimal(num).multiply(new BigDecimal(this.unitPrice)).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
