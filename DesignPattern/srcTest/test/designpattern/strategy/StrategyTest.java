package test.designpattern.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.strategy.*;

/**
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
@DisplayName("策略模式测试类")
public class StrategyTest {

    @Test
    @DisplayName("策略模式")
    public void testStrategy(){
        AbsStrategyOption option = new XianNingTravel();
        option.setTripMode(new HighSpeedRail("高铁"));
        option.setHostelMode(new StarredHotel("温泉大酒店"));
        System.out.println(option.goTo());
        option.setTripMode(new Coach("大巴"));
        option.setHostelMode(new HomeStay("家里蹲"));
        System.out.println(option.goBack());
    }
}
