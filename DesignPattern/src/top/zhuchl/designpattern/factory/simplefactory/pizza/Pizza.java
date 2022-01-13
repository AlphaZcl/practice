package top.zhuchl.designpattern.factory.simplefactory.pizza;

/**
 * 抽象产品类
 *
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public abstract class Pizza {

    private String pizzaName;

    public abstract void prepare();

    public void bake(){
        System.out.println(pizzaName + " baking;");
    }

    public void cut(){
        System.out.println(pizzaName + " cutting");
    }

    public void pack(){
        System.out.println(pizzaName + " packing");
    }

    public void setPizzaName(String pizzaName){
        this.pizzaName = pizzaName;
    }
}
