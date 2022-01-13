package top.zhuchl.designpattern.visitor.simple;

/**
 * 具体被操作元素
 *
 * @Author AlphaZcl
 * @Date 2021/12/17
 **/
public class Woman implements Person{
    @Override
    public String accept(Action action) {
        return action.getWomanResult(this);
    }

    public void doSome(){
        System.out.println("具体元素Woman执行业务逻辑");
    }
}
