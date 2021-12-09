package top.zhuchl.designpattern.command;

/**
 * 空命令，用于初始化值，当调用空命令时，什么都不做
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class NoCommand implements ServiceCommand{
    @Override
    public String execute(String args) {
        return null;
    }
}
