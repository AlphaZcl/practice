package top.zhuchl.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者/请求者：含有命令对象
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class ReqInvoker {

    private ServiceCommand command;

    public ReqInvoker(){
        command = new NoCommand();
    }

    /**
     * 客户端调用入口
     * @param args
     * @return
     */
    public String doInvoke(String args){
        return command.execute(args);
    }

    /**
     * 设置命令
     * @param command
     */
    public void setCommand(ServiceCommand command){
        this.command = command;
    }
}
