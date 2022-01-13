package top.zhuchl.designpattern.command.decorator;

import top.zhuchl.designpattern.command.ServiceCommand;

/**
 * 具体装饰类:扩展命令
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class ExtendHttpReqService implements ExtendHttpCommand {

    private ServiceCommand command;

    public ExtendHttpReqService(ServiceCommand command){
        this.command = command;
    }

    @Override
    public String execute(String args) {
        return command.execute(init(args));
    }

    @Override
    public String init(String args) {
        return args.trim();
    }
}
