package top.zhuchl.designpattern.buildermode.builder;

/**
 * 具体建造者：高楼建造者
 *
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
public class HighBuilder extends AbstractBuilder{
    @Override
    public void builderBase() {
        this.house.setBase("100米地基");
        System.out.println("建造高楼地基100米");
    }

    @Override
    public void builderWall() {
        this.house.setWall("50cm墙壁");
        System.out.println("建造高楼墙壁50cm");
    }

    @Override
    public void builderRoofed() {
        this.house.setRoofed("高楼屋顶");
        System.out.println("建造高楼屋顶");
    }
}
