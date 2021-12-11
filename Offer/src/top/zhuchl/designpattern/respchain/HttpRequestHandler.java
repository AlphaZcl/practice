package top.zhuchl.designpattern.respchain;

import java.util.Map;

/**
 * 具体处理者
 *
 * @Author AlphaZcl
 * @Date 2021/12/10
 **/
public class HttpRequestHandler extends HandlerExecution{

    @Override
    public String handlerRequest(ProcessRequest request) {
        if ("HTTP".equalsIgnoreCase(request.getType())){
            Map<String, Object> paramMap = request.getParamMap();
            return paramMap.toString();
        }
        HandlerExecution handler = getNextHandler();
        if(handler==null){
            return null;
        }
        return getNextHandler().handlerRequest(request);
    }
}
