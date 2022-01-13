package top.zhuchl.designpattern.proto;

import java.io.Serializable;

/**
 * 抽象原型类
 *
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
public interface ProtoTypeShape extends Cloneable, Serializable {

    /**
     * 必须实现的克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    Object clone() throws CloneNotSupportedException;

    /**
     *
     * @param newScale 保留小数点后位数
     * @return
     */
    double countArea(int newScale);
    
}
