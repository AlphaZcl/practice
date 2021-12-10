package top.zhuchl.designpattern.command.composite;

/**
 * 默认具体命令（空命令）：默认叶子节点，初始化树枝节点的叶子节点的容器
 *
 * @Author AlphaZcl
 * @Date 2021/12/10
 **/
public class DefaultCommand implements AbstractCommand{
    @Override
    public void execute(CommandContext context) {
        System.out.println("默认空命令");
    }
}
