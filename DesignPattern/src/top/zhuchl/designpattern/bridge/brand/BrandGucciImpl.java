package top.zhuchl.designpattern.bridge.brand;

import top.zhuchl.designpattern.bridge.BrandImplementor;

/**
 * 具体实现化角色：品牌分类具体实现：GUCCI
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class BrandGucciImpl implements BrandImplementor {

    private final static String BRAND_NAME = "GUCCI";

    @Override
    public String getBrandName() {
        return BRAND_NAME;
    }
}
