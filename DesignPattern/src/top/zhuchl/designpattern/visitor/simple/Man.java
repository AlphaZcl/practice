package top.zhuchl.designpattern.visitor.simple;

/**
 * 具体被操作元素
 *
 * @Author AlphaZcl
 * @Date 2021/12/17
 **/
public class Man implements Person{
    @Override
    public String accept(Action action) {
        return action.getManResult(this);
    }

    public void doService(){
        System.out.println("具体元素man执行业务逻辑");
    }
}
