package top.zhuchl.designpattern.command;

/**
 * 接受者：实现者
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class TcpReqHandler {

    /**
     * 具体业务实现方法
     * @param args
     * @return
     */
    public String doService(String args){
        return "Tcp Service:\t" + args;
    }
}
