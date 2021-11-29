package top.zhuchl.designpattern.singleton;

/**
 * @Author AlphaZcl
 * @Date 2021/11/26
 **/
public enum Singleton8 {
    INSTACNE("ss","ss");

    private String code;
    private String msg;
    private Singleton8(String code,String msg){
        this.msg = msg;
        this.code = code;
    }

    public void whateverMethod(){}
}
