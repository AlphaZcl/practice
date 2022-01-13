package top.zhuchl.designpattern.proxy.staticproxy;

/**
 * 真实主题对象
 *
 * @Author AlphaZcl
 * @Date 2021/12/1
 **/
public class RealTeacher implements ITeacher{

    @Override
    public void teach() {
        System.out.println("访问真实主题方法：老师授课");
    }
}
