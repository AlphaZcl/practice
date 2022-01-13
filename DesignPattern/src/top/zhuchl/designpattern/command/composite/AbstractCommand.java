package top.zhuchl.designpattern.command.composite;

/**
 * 抽象命令接口：作为组合模式的抽象构件角色
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public interface AbstractCommand {

    void execute(CommandContext context);
}
