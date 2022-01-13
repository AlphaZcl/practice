package test.designpattern.respchain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.zhuchl.designpattern.respchain.HandlerExecution;
import top.zhuchl.designpattern.respchain.HttpInterceptor;
import top.zhuchl.designpattern.respchain.HttpRequestHandler;
import top.zhuchl.designpattern.respchain.ProcessRequest;

import java.util.HashMap;

/**
 * @Author AlphaZcl
 * @Date 2021/12/10
 **/
@DisplayName("职责链模式")
public class RespChainTest {

    @DisplayName("客户端角色：对职责链进行组装")
    @Test
    public void testRespChain(){
        //组装职责链
        HttpInterceptor interceptor = new HttpInterceptor();
        HandlerExecution handler = new HttpRequestHandler();
        interceptor.setNextHandler(handler);

        //请求
        HashMap<String, Object> params = new HashMap<>();
        String type = "HTTP";
        ProcessRequest processRequest = new ProcessRequest(type, params);

        //提交请求
        String s = interceptor.handlerRequest(processRequest);
        System.out.println("result:"+s);
    }
}
