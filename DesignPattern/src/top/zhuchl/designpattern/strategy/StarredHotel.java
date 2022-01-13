package top.zhuchl.designpattern.strategy;

/**
 * 具体策略类
 *
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
public class StarredHotel implements HostelMode{

    private String hostelType;

    public StarredHotel(String hostelType){
        this.hostelType = hostelType;
    }

    @Override
    public String getInHotel() {
        return hostelType;
    }
}
