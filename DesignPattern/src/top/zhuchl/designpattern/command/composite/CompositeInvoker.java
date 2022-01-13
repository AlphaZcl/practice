package top.zhuchl.designpattern.command.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者/请求者：组合模式中的树枝节点
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class CompositeInvoker implements AbstractCommand{

    /**
     * 叶子节点管理容器
     */
    private List<AbstractCommand> commands = new ArrayList<>();

    public CompositeInvoker(){
        commands.add(new DefaultCommand());
    }

    public static final String REQ_KEY = "request";

    /**
     * 管理叶子构件：添加
     * @param command
     */
    public void add(AbstractCommand command){
        commands.add(command);
    }

    /**
     * 管理叶子构件：获取
     * @param index
     * @return
     */
    public AbstractCommand get(int index){
        return commands.get(index);
    }

    /**
     * 管理叶子构件：删除
     * @param command
     * @return
     */
    public boolean remove(AbstractCommand command){
       return commands.remove(command);
    }

    @Override
    public void execute(CommandContext context) {
        commands.stream().forEach(command->{
            if (command instanceof CompositeInvoker){
                throw new UnsupportedOperationException("错误容器");
            }
            command.execute(context);
        });
    }
}
