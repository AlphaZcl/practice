package top.zhuchl.designpattern.templatemethod;

/**
 * 具体子类
 *
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
public class OrmosiaSoybeanMilk extends SoybeanMilk{

    public OrmosiaSoybeanMilk(String materials){
        this.materials = materials;
    }
    @Override
    protected void addCondiments(String materials) {
        System.out.println("添加物："+materials);
    }
}
