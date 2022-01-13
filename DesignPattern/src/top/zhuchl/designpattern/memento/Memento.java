package top.zhuchl.designpattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 备忘录：保存发起人的内部状态
 *
 * @Author AlphaZcl
 * @Date 2021/12/19
 **/
@Data
@AllArgsConstructor
public class Memento {

    /**
     * 状态对象
     */
    private String state;

    /**
     * 对象属性信息：攻击力
     */
    private int vit;

    /**
     * 对象属性信息：防御力
     */
    private int def;

}
