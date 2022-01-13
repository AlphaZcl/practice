package top.zhuchl.designpattern.strategy;

/**
 * 环境子类
 *
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
public class XianNingTravel extends AbsStrategyOption{


    @Override
    public String goTo() {
        StringBuilder builder = new StringBuilder();
        builder.append("去："+this.getOut()+"\n");
        builder.append("住："+this.getInHotel()+"\n");
        return builder.toString();
    }

    @Override
    public String goBack() {
        StringBuilder builder = new StringBuilder();
        builder.append("回："+this.getIn()+"\n");
        builder.append("住："+this.getInHotel()+"\n");
        return builder.toString();
    }
}
