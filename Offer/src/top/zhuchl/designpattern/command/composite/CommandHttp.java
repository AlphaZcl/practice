package top.zhuchl.designpattern.command.composite;

/**
 * 具体命令：叶子节点
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class CommandHttp implements AbstractCommand{

    /**
     * 命令接受者
     */
    private ReqHandler handler;

    public CommandHttp(ReqHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute(CommandContext context) {
        handler.doHttp(context);
    }
}
