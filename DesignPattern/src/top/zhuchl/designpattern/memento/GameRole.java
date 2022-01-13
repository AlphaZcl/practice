package top.zhuchl.designpattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发起人：需要保存状态的对象
 *
 * @Author AlphaZcl
 * @Date 2021/12/19
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameRole {

    private String roleId;

    /**
     * 对象状态
     */
    private String state;

    /**
     * 攻击力
     */
    private int vit;

    /**
     * 防御力
     */
    private int def;

    /**
     * 创建备忘录：根据当前对象状态得到Memento
     * @return 返回状态对象，最终存入备忘录管理者
     */
    public Memento createMemento(){
        return new Memento(state,vit,def);
    }

    /**
     * 通过备忘录对象，恢复状态
     * @param memento
     */
    public void recoverFromMemento(Memento memento){
        state = memento.getState();
        vit = memento.getVit();
        def = memento.getDef();
    }

}
