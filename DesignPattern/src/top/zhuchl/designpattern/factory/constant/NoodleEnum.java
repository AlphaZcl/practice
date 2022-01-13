package top.zhuchl.designpattern.factory.constant;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public enum NoodleEnum {

    HOT_DRY_NOODLE("W01","热干面"),
    YOU_PO_NOODLE("W02","油泼面");

    private String type;

    private String noodleName;

    public String getType(){
        return type;
    }

    public String getNoodlesName(){
        return noodleName;
    }

    private NoodleEnum(String type, String foodName){
        this.type = type;
        this.noodleName = foodName;
    }

    public static NoodleEnum getNoodlesByType(String type){
        if(type == null || type.length()==0){
            return null;
        }
        for (NoodleEnum e: values()) {
            if(e.type.equals(type)){
                return e;
            }
        }
        return null;
    }

}
