package top.zhuchl.dataStructureAndAlgorithm.array.easy.datastructure.sortedarraytobst;

/**
 * 将有序数组转换为二叉搜索树
 * @Author AlphaZcl
 * @Date 2021/6/25
 **/
public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(){}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("{");
        buildStr(this,sb);
        String str = sb.substring(0,sb.lastIndexOf(","));
        return str + "}";
    }

    /**
     * 中序遍历
     * @param node
     * @param sb
     */
    public void buildStr(TreeNode node,StringBuffer sb){
        if(node.left != null){
            buildStr(node.left,sb);
        }
        sb.append(node.val);
        sb.append(",");
        if(node.right != null){
            buildStr(node.right,sb);
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(-3);
        node.right = new TreeNode(5);
        node.left.left = new TreeNode(-10);
        node.right.right = new TreeNode(9);
        System.out.println(node.toString());
    }
}
