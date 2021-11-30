package top.zhuchl.designpattern.buildermode.director;

import top.zhuchl.designpattern.buildermode.builder.AbstractBuilder;
import top.zhuchl.designpattern.buildermode.product.House;

/**
 * 指挥者
 *
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
public class HouseDirector {

    private AbstractBuilder builder;

    public HouseDirector(AbstractBuilder builder){
        this.builder = builder;
    }

    /**
     * 产品构建与组装方法
     * @return
     */
    public House constructHouse(){
        builder.builderBase();
        builder.builderWall();
        builder.builderRoofed();
        return builder.buildHouse();
    }
}
