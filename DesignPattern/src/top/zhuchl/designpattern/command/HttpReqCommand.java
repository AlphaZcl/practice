package top.zhuchl.designpattern.command;

/**
 * 具体命令类:含有命令接受者对象
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class HttpReqCommand implements ServiceCommand{

    /**
     * 命令接受者
     */
    private HttpReqHandler httpHandler;

    public HttpReqCommand(HttpReqHandler httpHandler){
        this.httpHandler =  httpHandler;
    }

    @Override
    public String execute(String args) {

        return httpHandler.doService(args);
    }
}
