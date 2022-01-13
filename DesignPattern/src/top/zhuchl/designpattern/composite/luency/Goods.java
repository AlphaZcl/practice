package top.zhuchl.designpattern.composite.luency;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 树叶构件：具体商品类（叶子节点）
 *
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
@Data
public class Goods implements Commodity{

    /**
     * 物品名称
     */
    private String goodsName;

    /**
     * 商品数量
     */
    private int quantity;

    /**
     * 商品单价
     */
    private double unitPrice;

    public Goods(){}

    public Goods(int quantity,double unitPrice,String goodsName){
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.goodsName = goodsName;
    }

    @Override
    public double calculation() {
        return new BigDecimal(this.quantity).multiply(new BigDecimal(this.unitPrice)).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    @Override
    public boolean add(Commodity commodity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Commodity get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Commodity commodity) {
        throw new UnsupportedOperationException();
    }
}
