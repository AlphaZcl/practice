package top.zhuchl.designpattern.command.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * 接受者，实现者
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class ReqHandler {

    public void doTcp(CommandContext context){
        Object requestParam = context.getRequestParam();
        System.out.println("doTcp"+requestParam);
        Map<String,Object> resMap = new HashMap<>();
        resMap.put("tcp","tcp response");
        context.setResponse(resMap);
    }

    public void doHttp(CommandContext context){
        Object requestParam = context.getRequestParam();
        System.out.println("doHttp"+requestParam);
    }
}
