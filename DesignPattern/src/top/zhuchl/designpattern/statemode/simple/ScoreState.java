package top.zhuchl.designpattern.statemode.simple;

import lombok.Data;

/**
 * 抽象状态类：分数状态
 *
 * @Author AlphaZcl
 * @Date 2021/12/11
 **/
public abstract class ScoreState {

    /**
     *  根据业务执行变更当前状态
     */
    protected ScoreContext context;

    /**
     * 业务数据
     */
    protected int score;

    /**
     * 状态名称
     */
    protected String stateName;

    /**
     * 实际业务处理方法
     */
    public void addScore(int curScore) {
        this.score += curScore;
        System.out.print("加上"+curScore+"\t 当前分数："+this.score);
        checkState(curScore);
        System.out.println("\t，当前状态"+context.getState().stateName);
    }

    /**
     * 状态变更
     */
    public abstract void checkState(int curScore);
}
