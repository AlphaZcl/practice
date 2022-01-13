package top.zhuchl.designpattern.buildermode.builder;

import top.zhuchl.designpattern.buildermode.product.House;

/**
 * 抽象建造者
 *
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
public abstract class AbstractBuilder {

    /**
     * 完整产品
     */
    protected House house = new House();

    /**
     * 建造地基部分
     */
    public abstract void builderBase();

    /**
     * 建造墙壁部分
     */
    public abstract void builderWall();

    /**
     * 建造屋顶部分
     */
    public abstract void builderRoofed();

    /**
     * 返回具体产品（粗加工）
     * @return
     */
    public House buildHouse(){
        return house;
    }
}