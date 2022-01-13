package top.zhuchl.designpattern.adapter.classadapter;

/**
 * 适配者，被适配类
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class ClassAdaptee {

    public int specificRequest(){
        System.out.println("适配者业务代码");
        return 220;
    }
}
