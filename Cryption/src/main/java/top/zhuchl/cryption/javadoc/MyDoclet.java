package top.zhuchl.cryption.javadoc;

import com.sun.javadoc.Doclet;
import com.sun.javadoc.RootDoc;

/**
 * 用来获取javadoc解析完成后生成的语法树根节点
 *
 * @Author AlphaZcl
 * @Date 2023/10/19
 **/
public class MyDoclet extends Doclet {

    /**
     * 静态对象，用于接收javadoc解析完成后生成的语法树根节点，使用它获取需要的数据
     */
    private static RootDoc root;

    /**
     * 在javadoc解析完java文件后，生成语法树，然后就会调用这个方法让Doclet生成doc文档
     * @param root
     * @return
     */
    public static boolean start(RootDoc root) {
        MyDoclet.root = root;
        return true;
    }

    public static RootDoc getRoot() {
        return root;
    }

}
