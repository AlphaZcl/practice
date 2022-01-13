package top.zhuchl.designpattern.templatemethod;

/**
 * 抽象模板：定义制作过程
 *
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
public abstract class SoybeanMilk {

    protected String materials;

    public final void templateMake(){
        //具体方法：选材
        selectMaterials();

        //钩子方法
        if (customerAdd()){
            addCondiments(materials);
        }

        //具体方法
        soak();

        //具体方法
        grind();

    }

    protected void grind() {
        System.out.println("豆浆研磨");
    }

    protected void soak() {
        System.out.println("浸泡5min");
    }

    /**
     * 抽象方法
     */
    protected abstract void addCondiments(String materials);


    /**
     * 具体方法：公共处理
     */
    protected void selectMaterials(){
        System.out.println("选择材料：黄豆");
    }

    /**
     * 钩子方法：是否添加
     */
    protected boolean customerAdd(){
        return true;
    }

}
