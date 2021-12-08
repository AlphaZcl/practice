package top.zhuchl.designpattern.templatemethod;

/**
 * 具体子类
 *
 * @Author AlphaZcl
 * @Date 2021/12/8
 **/
public class PeanutSoybeanMilk extends SoybeanMilk{

    public PeanutSoybeanMilk(String materials){
        this.materials = materials;
    }

    @Override
    public void addCondiments(String materials) {
        System.out.println("添加物："+materials);
    }
}
