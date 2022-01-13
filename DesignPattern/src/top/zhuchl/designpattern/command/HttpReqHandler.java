package top.zhuchl.designpattern.command;

/**
 * 实现者/执行者：命令真正的实现执行者
 *
 * @Author AlphaZcl
 * @Date 2021/12/9
 **/
public class HttpReqHandler {

    /**
     * 具体业务实现方法
     * @param requestParam 业务实现参数
     * @return
     */
    public String doService(String requestParam){
        String res = "Http service:\t"+requestParam;
        return res;
    }
}
