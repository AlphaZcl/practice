package top.zhuchl.designpattern.command;

/**
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class TcpReqCommand implements ServiceCommand{

    private TcpReqHandler handler;

    public TcpReqCommand(TcpReqHandler handler){
        this.handler = handler;
    }

    @Override
    public String execute(String args) {
        return handler.doService(args);
    }

}
