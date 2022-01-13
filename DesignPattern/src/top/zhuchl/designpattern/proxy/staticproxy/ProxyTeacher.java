package top.zhuchl.designpattern.proxy.staticproxy;

/**
 * 代理类
 *
 * @Author AlphaZcl
 * @Date 2021/12/1
 **/
public class ProxyTeacher implements ITeacher{
    /**
     * 真实主题对象
     */
    private RealTeacher realTeacher;

    @Override
    public void teach() {
        if(realTeacher == null){
            realTeacher = new RealTeacher();
        }
        //扩展：在真实主题前进行的操作
        preTeach();

        //对真实主题对象的引用
        realTeacher.teach();

        //扩展：在真实主题后进行的操作
        postTeach();
    }

    private void preTeach(){
        System.out.println("访问真实主题前的预处理");
    }

    private void postTeach(){
        System.out.println("访问真实主题之后的后续处理");
    }
}
