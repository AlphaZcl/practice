package top.zhuchl.designpattern.respchain;

/**
 * 具体执行者
 *
 * @Author AlphaZcl
 * @Date 2021/12/10
 **/
public class HttpInterceptor extends HandlerExecution {
    @Override
    public String handlerRequest(ProcessRequest request) {
        System.out.println("interceptor");
        request.getParamMap().put("req","http");
        HandlerExecution handler = getNextHandler();
        if(handler==null){
            return null;
        }
        return handler.handlerRequest(request);
    }
}
