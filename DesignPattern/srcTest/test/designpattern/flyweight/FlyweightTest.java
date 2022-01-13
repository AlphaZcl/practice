package test.designpattern.flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.flyweight.UserInfo;
import top.zhuchl.designpattern.flyweight.WebSite;
import top.zhuchl.designpattern.flyweight.WebSiteFactory;

/**
 * @Author AlphaZcl
 * @Date 2021/12/7
 **/
public class FlyweightTest {

    @Test
    @DisplayName("多享元模式测试")
    public void test1(){
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite concreteWebSiteA = webSiteFactory.getWebSite("A", "site_a");
        concreteWebSiteA.show(new UserInfo("system_a"));
        WebSite concreteWebSiteB = webSiteFactory.getWebSite("B", "site_b");
        concreteWebSiteB.show(new UserInfo("system_b"));
        WebSite webSite = webSiteFactory.getWebSite("C", "site_a");
        System.out.println(webSite == concreteWebSiteA);
    }
}
