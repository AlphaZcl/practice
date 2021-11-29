package top.zhuchl.designpattern.factory.constant;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public enum PastryEnum {

    HOT_DRY_NOODLE("W01","热干面"),
    YOU_PO_NOODLE("W02","油泼面");

    private String type;

    private String foodName;

    public String getType(){
        return type;
    }

    public String getNoodlesName(){
        return foodName;
    }

    private PastryEnum(String type, String foodName){
        this.type = type;
        this.foodName = foodName;
    }

    public static PastryEnum getNoodlesByType(String type){
        if(type == null || type.length()==0){
            return null;
        }
        for (PastryEnum e: values()) {
            if(e.type.equals(type)){
                return e;
            }
        }
        return null;
    }

}
