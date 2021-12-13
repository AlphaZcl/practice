package top.zhuchl.designpattern.statemode.simple;

import lombok.Data;

/**
 * 环境类：提供外部访问接口
 *
 * @Author AlphaZcl
 * @Date 2021/12/11
 **/
@Data
public class ScoreContext {

    /**
     * 表示当前状态
     */
    private ScoreState state;

    public ScoreContext(){
        //初始化当前状态
        state = new LowState(this);
    }

    public void doInvoker(int curScore){
        state.addScore(curScore);
    }

}
