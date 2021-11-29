package top.zhuchl.designpattern.factory.factorymethod.product;

/**
 *  产品抽象类
 *
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public abstract class AbstractNoodle {

    /**
     *  原材料准备
     * @param materials
     */
    public abstract void prepare(String materials);

    public void cookNoodle(){
        System.out.println("煮面条");
    }

}
