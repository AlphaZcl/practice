package top.zhuchl.designpattern.bridge.color;

import top.zhuchl.designpattern.bridge.ColorImplementor;

/**
 * 具体实现化角色：颜色分类具体实现：yellow
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class ColorYellowImpl implements ColorImplementor {

    public static final String COLOR_YELLOW = "yellow";

    @Override
    public String getColorName() {
        return COLOR_YELLOW;
    }
}
