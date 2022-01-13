package top.zhuchl.designpattern.bridge;

/**
 * 抽象化角色：第三个维度：包种类，并整合其余分类维度
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public abstract class AbsBagType {

    /**
     * 实现化角色：品牌的引用
     */
    private BrandImplementor brand;

    /**
     * 实现化角色：颜色的引用
     */
    private ColorImplementor color;

    protected BrandImplementor getBrand(){
        return this.brand;
    }

    protected void setBrand(BrandImplementor brand){
        this.brand = brand;
    }

    protected ColorImplementor getColor(){
        return this.color;
    }

    protected void setColor(ColorImplementor color){
        this.color = color;
    }

    /**
     * 获取最终完整的分类信息
     * @return
     */
    public abstract String getBagDetail();
}
