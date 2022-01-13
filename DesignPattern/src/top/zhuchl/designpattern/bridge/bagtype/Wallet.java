package top.zhuchl.designpattern.bridge.bagtype;

import top.zhuchl.designpattern.bridge.AbsBagType;
import top.zhuchl.designpattern.bridge.BrandImplementor;
import top.zhuchl.designpattern.bridge.ColorImplementor;

/**
 * 扩展抽象化角色：最终外部访问的对象
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class Wallet extends AbsBagType {

    public static final String WALLET = "Wallet";

    public Wallet(BrandImplementor brand, ColorImplementor color){
        setBrand(brand);
        setColor(color);
    }

    @Override
    public String getBagDetail() {
        return getBrand().getBrandName() + "," + WALLET + "," + getColor().getColorName();
    }
}
