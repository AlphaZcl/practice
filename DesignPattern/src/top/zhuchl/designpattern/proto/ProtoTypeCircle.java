package top.zhuchl.designpattern.proto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.math.BigDecimal;

/**
 * 具体原型类
 *
 * @Author AlphaZcl
 * @Date 2021/11/30
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProtoTypeCircle implements ProtoTypeShape {

    private String name;

    private double radius;

    /**
     * 深度克隆
     *
     * @return
     */
    @Override
    public Object clone() {
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            ProtoTypeCircle cloneObj = (ProtoTypeCircle) ois.readObject();
            return cloneObj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (bos != null && oos != null && bis != null && ois != null) {
                try {
                    bos.close();
                    oos.close();
                    bis.close();
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    @Override
    public double countArea(int newScale) {
        double area = this.radius * Math.PI;
        BigDecimal bigDecimal = new BigDecimal(area).setScale(newScale,BigDecimal.ROUND_HALF_UP);
        area = bigDecimal.doubleValue();
        return area;
    }
}
