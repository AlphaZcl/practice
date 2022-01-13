package top.zhuchl.designpattern.command.decorator;

import top.zhuchl.designpattern.command.ServiceCommand;

/**
 * 装饰器接口: 扩展原命令接口功能
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public interface ExtendHttpCommand extends ServiceCommand {

    /**
     * 扩展功能
     */
    String init(String args);
}
