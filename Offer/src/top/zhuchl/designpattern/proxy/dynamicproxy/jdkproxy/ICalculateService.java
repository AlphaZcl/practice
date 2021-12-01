package top.zhuchl.designpattern.proxy.dynamicproxy.jdkproxy;

/**
 * 抽象主题接口
 *
 * @Author AlphaZcl
 * @Date 2021/12/1
 **/
public interface ICalculateService {

    double add(double a,double b,int newScale);

    double sub(double a,double b,int newScale);

    double mul(double a,double b,int newScale);

    double div(double a,double b,int newScale);
}
