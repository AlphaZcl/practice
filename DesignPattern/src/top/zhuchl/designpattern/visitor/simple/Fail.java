package top.zhuchl.designpattern.visitor.simple;

/**
 * 具体访问者
 *
 * @Author AlphaZcl
 * @Date 2021/12/17
 **/
public class Fail implements Action{
    @Override
    public String getManResult(Man man) {
        man.doService();
        return "fail";
    }

    @Override
    public String getWomanResult(Woman woman) {
        woman.doSome();
        return "fail";
    }
}
