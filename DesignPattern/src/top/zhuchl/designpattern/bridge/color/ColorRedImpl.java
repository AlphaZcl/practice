package top.zhuchl.designpattern.bridge.color;

import top.zhuchl.designpattern.bridge.ColorImplementor;

/**
 * 具体实现化角色：颜色分类具体实现：red
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class ColorRedImpl implements ColorImplementor {

    private static final String COLOR_RED = "red";

    @Override
    public String getColorName() {
        return COLOR_RED;
    }
}
