package top.zhuchl.designpattern.statemode.simple;

/**
 * 具体状态类
 *
 * @Author AlphaZcl
 * @Date 2021/12/11
 **/
public class HighState extends ScoreState{

    public HighState(ScoreContext context){
        this.context = context;
        this.stateName = "优秀";
    }

    @Override
    public void checkState(int curScore) {
        if(curScore<60){
            context.setState(new LowState(context));
        }else if (curScore<90){
            context.setState(new MiddleState(context));
        }
    }
}
