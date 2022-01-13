package top.zhuchl.designpattern.interpreter;

/**
 * 环境类：解释器公共的资源
 *
 * @Author AlphaZcl
 * @Date 2021/12/22
 **/
public class Context {

    private String[] citys = {"武汉","孝感"};

    private String[] persons = {"老人","学生"};

    private AbsExpression cityPerson;

    public Context(){
        //初始化数据
        AbsExpression city = new TerminalExpression(citys);
        AbsExpression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city,person);
    }

    public String runFreeRide(String info){
        boolean flag = cityPerson.interpret(info);
        String res = flag ? "您是" + info + "，您本次乘车免费！" : info + "，您不是免费人员，本次乘车扣费2元！";
        return res;
    }
}
