package top.zhuchl.designpattern.visitor.simple;

/**
 * 具体访问者
 *
 * @Author AlphaZcl
 * @Date 2021/12/17
 **/
public class Success implements Action{
    @Override
    public String getManResult(Man man) {
        man.doService();
        return "success";
    }

    @Override
    public String getWomanResult(Woman woman) {
        woman.doSome();
        return "success";
    }
}
