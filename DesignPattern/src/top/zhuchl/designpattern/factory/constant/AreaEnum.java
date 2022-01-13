package top.zhuchl.designpattern.factory.constant;

/**
 * @Author AlphaZcl
 * @Date 2021/11/29
 **/
public enum AreaEnum {

    HU_BEI("001","武汉"),
    SHAAN_XI("002","陕西");

    private String areaCode;

    private String areaName;

    public String getAreaName(){
        return this.areaName;
    }

    private AreaEnum(String areaCode,String areaName){
        this.areaCode = areaCode;
        this.areaName = areaName;
    }

    public static AreaEnum getInstance(String areaCode){
        for (AreaEnum e :
                values()) {
            if (e.areaCode.equals(areaCode)){
                return e;
            }
        }
        return null;
    }
}
