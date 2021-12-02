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
public class HandBag extends AbsBagType {

    public static final String HAND_BAG = "HandBag";

    public HandBag(BrandImplementor brandName, ColorImplementor color){
        setBrand(brandName);
        setColor(color);
    }

    @Override
    public String getBagDetail() {
        return getBrand().getBrandName()+ "," + HAND_BAG + "," +getColor().getColorName();
    }
}
