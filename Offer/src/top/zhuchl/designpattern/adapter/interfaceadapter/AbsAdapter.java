package top.zhuchl.designpattern.adapter.interfaceadapter;

/**
 * 抽象适配器：默认实现目标接口空实现
 *
 * @Author AlphaZcl
 * @Date 2021/12/2
 **/
public abstract class AbsAdapter implements Target{

    @Override
    public void request1() {
    }

    @Override
    public void request2() {
    }

    @Override
    public void request3() {
    }

    @Override
    public void request4() {
    }
}
