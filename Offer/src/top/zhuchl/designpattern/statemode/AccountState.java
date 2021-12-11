package top.zhuchl.designpattern.statemode;

/**
 * 优化：抽象账务状态接口
 *
 * @Author AlphaZcl
 * @Date 2021/12/11
 **/
public interface AccountState {

    /**
     * 退款前处理
     * 状态变更：初始化->退款中
     */
    public abstract void beforeRefund();

    /**
     * 退款处理：发送退款请求，核心账务响应后进行对应变更
     * 状态变更：退款中->核心响应后退款结果
     */
    public abstract void refundReq();

    /**
     * 退款后处理：核心响应超时或者失败，发送请求至核心进行交易状态查询
     * 状态变更：退款中->最终账务结果
     */
    public abstract void refundAfter();
}
