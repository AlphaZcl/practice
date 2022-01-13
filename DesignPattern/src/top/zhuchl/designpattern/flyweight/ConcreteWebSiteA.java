package top.zhuchl.designpattern.flyweight;

/**
 * 具体享元角色：网页具体使用者A
 *
 * @Author AlphaZcl
 * @Date 2021/12/6
 **/
public class ConcreteWebSiteA implements WebSite {

    /**
     * 类型常量
     */
    public static final String WEB_TYPE_A = "A";

    /**
     * 关键字key，用于被享元工厂管理使用
     */
    private String key;

    public ConcreteWebSiteA(String key){
        this.key = key;
    }

    @Override
    public void show(UserInfo userInfo) {
        System.out.println("网络使用者："+userInfo.getUserName());
    }
}
