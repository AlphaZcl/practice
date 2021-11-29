package top.zhuchl.designpattern.factory.constant;

/**
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public enum PizzaEnum {

    SEAFOOD_PIZZA("001","SEAFOOD"),
    CHEESE_PIZZA("002","CHEESE"),
    FRUIT_PIZZA("003","FRUIT");


    private String code;

    private String pizzaName;

    public String getPizzaName(){
        return pizzaName;
    }

   private PizzaEnum(String code,String type){
        this.code = code;
        this.pizzaName = type;
    }

    public static PizzaEnum getPizzaType(String code){
        for (PizzaEnum pizza: values()) {
            if(pizza.code.equals(code)){
                return pizza;
            }
        }
        return null;
    }
}
