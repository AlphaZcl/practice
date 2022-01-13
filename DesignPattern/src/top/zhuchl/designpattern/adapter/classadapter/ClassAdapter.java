package top.zhuchl.designpattern.adapter.classadapter;

/**
 * 适配器
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public class ClassAdapter extends ClassAdaptee implements ClassAdapterTarget {
    @Override
    public int request() {
        System.out.println("调用适配者方法，进行转换");
        int srcRes = specificRequest();
        int dstRes = srcRes / 44;
        return dstRes;
    }
}
