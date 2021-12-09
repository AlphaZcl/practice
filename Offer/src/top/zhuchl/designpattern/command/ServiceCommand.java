package top.zhuchl.designpattern.command;

/**
 * 抽象命令接口：定义命令
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public interface ServiceCommand {

    /**
     * 执行服务
     * @param args
     * @return
     */
    String execute(String args);

}
