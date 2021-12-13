package top.zhuchl.designpattern.statemode.simple;

/**
 * 具体状态类
 *
 * @Author AlphaZcl
 * @Date 2021/12/11
 **/
public class LowState extends ScoreState{

    public LowState(ScoreContext context){
        this.context = context;
        this.stateName = "不及格";
    }

    @Override
    public void checkState(int curScore){
        if (curScore >= 90) {
            context.setState(new HighState(context));
        }else if(curScore >= 60){
            context.setState(new MiddleState(context));
        }
    }
}
