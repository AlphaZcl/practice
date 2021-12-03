package top.zhuchl.designpattern.decorator;

import java.math.BigDecimal;

/**
 * 具体装饰者
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
public class Milk extends AbsDecorator{

    public Milk(Drink drink,double unitPrice,int num){
        this.drink = drink;
        this.unitPrice = unitPrice;
        this.num = num;
    }

    @Override
    public double sale() {
        return super.sale()+add();
    }

    @Override
    public String order() {
       return super.order() + "\t牛奶";
    }

    @Override
    public double add(){
        System.out.println("添加牛奶");
        return new BigDecimal(num).multiply(new BigDecimal(this.unitPrice)).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
