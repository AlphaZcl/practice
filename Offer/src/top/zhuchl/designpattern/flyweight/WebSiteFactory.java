package top.zhuchl.designpattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author AlphaZcl
 * @Date 2021/12/6
 **/
public class WebSiteFactory {

    /**
     * 享元角色列表
     */
    private Map<String,WebSite> webPool = new ConcurrentHashMap<>();


    /**
     * 获取具体享元对象
     *
     * @param type
     * @return
     */
    public WebSite getWebSite(String type,String key){
        WebSite webSite = null;
        if (type == null || key == null){
            return null;
        }
        if(webPool.containsKey(key)){
            webSite = webPool.get(key);
        }else{
            switch (type){
                case ConcreteWebSiteA.WEB_TYPE_A:
                    webSite = new ConcreteWebSiteA(key);
                    break;
                case ConcreteWebSiteB.WEB_TYPE_B:
                    webSite = new ConcreteWebSiteB(key);
                    break;
                default:
                    throw new RuntimeException("类型不正确");
            }
            webPool.put(key,webSite);
        }
        return webSite;
    }

}
