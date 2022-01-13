package top.zhuchl.designpattern.proto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProtoTypeSquare implements ProtoTypeShape {

    private String name;

    private double length;

    private double wide;

    /**
     * 浅克隆
     * @return
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        ProtoTypeSquare clone = (ProtoTypeSquare)super.clone();
        return clone;
    }

    @Override
    public double countArea(int newScale) {
        double area = new BigDecimal(this.length*this.wide).setScale(newScale,BigDecimal.ROUND_HALF_UP).doubleValue();
        return area;
    }
}
