package top.zhuchl.designpattern.observer;

/**
 * 具体观察者：进口公司
 *
 * @Author AlphaZcl
 * @Date 2021/12/13
 **/
public class ImportCompany extends Company{

    @Override
    public void updateData(int number) {
        rateValue = number;
        if(number > 0){
            System.out.println("人民币汇率升值" + number + "个基点，降低了进口产品成本，提升了进口公司利润率。");
        }else if(number < 0){
            System.out.println("人民币汇率贬值" + (-number) + "个基点，提升了进口产品成本，降低了进口公司利润率。");
        }
    }
}
