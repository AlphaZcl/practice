package top.zhuchl.designpattern.proto;

import java.util.HashMap;

/**
 * 原型管理器
 *
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
public class ProtoTypeManager {

    /**
     * 管理器容器
     */
    private HashMap<String,ProtoTypeShape> defaultProtoTypeManager = new HashMap<>();

    /**
     * 添加元素进管理器
     * @param shapeName
     * @param shape
     * @return
     */
    public boolean addShape(String shapeName,ProtoTypeShape shape){
        ProtoTypeShape put = defaultProtoTypeManager.put(shapeName, shape);
        if(put == null){
            return true;
        }
        return false;
    }

    /**
     * 获取原生实例的克隆对象
     * @param shapeName
     * @return
     */
    public ProtoTypeShape getShape(String shapeName) throws CloneNotSupportedException {
        ProtoTypeShape protoTypeShape = defaultProtoTypeManager.get(shapeName);
        return (ProtoTypeShape) protoTypeShape.clone();
    }

}
