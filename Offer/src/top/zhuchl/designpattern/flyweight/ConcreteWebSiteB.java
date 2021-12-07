package top.zhuchl.designpattern.flyweight;

/**
 * 具体享元角色：网页具体使用者B
 *
 * @Author AlphaZcl
 * @Date 2021/12/6
 **/
public class ConcreteWebSiteB implements WebSite{

    public static final String WEB_TYPE_B = "B";

    /**
     * 关键字key，用于被享元工厂管理使用
     */
    private String info;

    public ConcreteWebSiteB(String info){
        this.info = info;
    }

    @Override
    public void show(UserInfo userInfo) {
        System.out.println("网页使用者："+userInfo.getUserName());
    }
}
