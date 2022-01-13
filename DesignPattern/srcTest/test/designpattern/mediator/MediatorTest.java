package test.designpattern.mediator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.mediator.Buyer;
import top.zhuchl.designpattern.mediator.EstateMedium;
import top.zhuchl.designpattern.mediator.Medium;
import top.zhuchl.designpattern.mediator.Seller;
import top.zhuchl.designpattern.mediator.singleton.Colleague;
import top.zhuchl.designpattern.mediator.singleton.ColleagueA;
import top.zhuchl.designpattern.mediator.singleton.ColleagueB;
import top.zhuchl.designpattern.mediator.singleton.ConcreteMediator;

/**
 *
 * @Author AlphaZcl
 * @Date 2021/12/14
 **/
@DisplayName("中介者模式")
public class MediatorTest {

    @DisplayName("简单中介者模式")
    @Test
    public void testMediator(){
        Medium estateMedium = new EstateMedium();
        Seller seller = new Seller("seller");
        Buyer buyer = new Buyer("buyer");
        estateMedium.register(seller);
        estateMedium.register(buyer);
        seller.sendMessage("buyer","两室一厅诚心出租");
    }

    @Test
    @DisplayName("单例模式中介者")
    public void testSingletonMediator(){
        Colleague a = new ColleagueA("a");
        Colleague b = new ColleagueB("b");
        a.sendMessage("b","搞定它");
        b.sendMessage("a","搞定了");
    }
}
