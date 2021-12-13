package top.zhuchl.designpattern.statemode.simple;

/**
 * 具体状态类
 *
 * @Author AlphaZcl
 * @Date 2021/12/11
 **/
public class MiddleState extends ScoreState{

    public MiddleState(ScoreContext context){
        this.context = context;
        this.stateName = "中等";
    }

    @Override
    public void checkState(int curScore) {
        if(curScore <60){
            context.setState(new LowState(context));
        }else if(curScore > 90){
            context.setState(new HighState(context));
        }
    }
}
