package top.zhuchl.dataStructureAndAlgorithm.tooffer.datastructure.buildtree;

/**
 * @Author AlphaZcl
 * @Date 2021/7/7
 **/
public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        prePrint(this,builder);
        String resStr = builder.toString();
        resStr = resStr.substring(0,resStr.lastIndexOf(","));
        return  resStr + "}";
    }

    private void prePrint(TreeNode node,StringBuilder builder){
        builder.append(node.val);
        builder.append(",");
        if(node.left != null){
            prePrint(node.left,builder);
        }
        if(node.right != null){
            prePrint(node.right,builder);
        }
    }
}
