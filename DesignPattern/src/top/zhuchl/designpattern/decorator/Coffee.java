package top.zhuchl.designpattern.decorator;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

/**
 * 具体构件角色
 *
 * @Author AlphaZcl
 * @Date 2021/12/3
 **/
@AllArgsConstructor
public class Coffee implements Drink{

    private String type;

    private double unitPrice;

    private int orderNum;

    @Override
    public double sale() {
        double total =  new BigDecimal(unitPrice).multiply(new BigDecimal(orderNum)).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        return total;
    }

    @Override
    public String order() {
        String result  = "订购:" + type + "\t" + orderNum;
        return result;
    }
}
