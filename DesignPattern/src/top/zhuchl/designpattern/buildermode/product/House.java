package top.zhuchl.designpattern.buildermode.product;

import lombok.Data;
import lombok.ToString;

/**
 * 产品：房子
 *
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
@Data
@ToString
public class House {

    private String base;

    private String wall;

    private String roofed;
}
