package top.zhuchl.designpattern.buildermode.builder;

/**
 * 具体建造者：普通房屋建造者
 *
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
public class CommonBuilder extends AbstractBuilder{
    @Override
    public void builderBase() {
        this.house.setBase("5米地基");
        System.out.println("建造普通地基5米");
    }

    @Override
    public void builderWall() {
        this.house.setWall("15cm墙壁");
        System.out.println("建造普通墙壁15cm");
    }

    @Override
    public void builderRoofed() {
        this.house.setRoofed("普通屋顶");
        System.out.println("建造普通屋顶");
    }
}
