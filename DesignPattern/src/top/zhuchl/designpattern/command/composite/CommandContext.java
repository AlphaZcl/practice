package top.zhuchl.designpattern.command.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文容器
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class CommandContext {

    private Map<String,Object> context = new HashMap<>(30);

    public static final String REQUEST_PARAM_KEY = "requestParam";

    public static final String RESPONSE_KEY = "response";

    public Object getRequestParam(){
        return context.get(REQUEST_PARAM_KEY);
    }

    public void setRequestParam(Object param){
        context.put(REQUEST_PARAM_KEY,param);
    }

    public Object getResponse(){
        return context.get(RESPONSE_KEY);
    }

    public void setResponse(Object obj){
        context.put(RESPONSE_KEY,obj);
    }
}
