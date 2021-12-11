package top.zhuchl.designpattern.respchain;

/**
 * 抽象处理者：定义抽象处理方法和一个后续连接
 *
 * @Author AlphaZcl
 * @Date 2021/12/10
 **/
public abstract class HandlerExecution {

    /**
     * 后续处理者
     */
    private HandlerExecution nextHandler;

    public HandlerExecution getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(HandlerExecution handler){
        this.nextHandler = handler;
    }

    /**
     * 业务处理方法
     * @param request
     * @return
     */
    public abstract String handlerRequest(ProcessRequest request);

}
