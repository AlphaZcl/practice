package top.zhuchl.designpattern.proxy.dynamicproxy.jdkproxy;

import java.math.BigDecimal;

/**
 * 真实主题：被代理类
 *
 * @Author AlphaZcl
 * @Date 2021/12/1
 **/
public class CalculateServiceImpl implements ICalculateService {


    @Override
    public double add(double a, double b, int newScale) {
        return doNewScale(new BigDecimal(a).add(new BigDecimal(b)),newScale);
    }

    @Override
    public double sub(double a, double b, int newScale) {
        return doNewScale(new BigDecimal(a).subtract(new BigDecimal(b)),newScale);
    }


    @Override
    public double mul(double a, double b, int newScale) {
        return doNewScale(new BigDecimal(a).multiply(new BigDecimal(b)),newScale);
    }

    @Override
    public double div(double a, double b, int newScale) {
        return doNewScale(new BigDecimal(a).divide(new BigDecimal(b)),newScale);
    }

    private double doNewScale(BigDecimal arg,Integer newScale){
        return arg.setScale(newScale.intValue(),BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
