package top.zhuchl.dataStructureAndAlgorithm.tooffer.medium;

import top.zhuchl.dataStructureAndAlgorithm.tooffer.datastructure.buildtree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 * @Author AlphaZcl
 * @Date 2021/7/7
 **/
public class BuildTree {

    Map<Integer, Integer> inMap = new HashMap<>();
    int[] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        return build(0,0,inorder.length-1);
    }

    private TreeNode build(int rootIdx,int left,int right){
        if(left > right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[rootIdx]);
        int index = inMap.get(preorder[rootIdx]);
        root.left = build(rootIdx+1,left,index-1);
        root.right = build(rootIdx+index-left+1,index+1,right);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inoreder = {9,3,15,20,7};
        BuildTree bt = new BuildTree();
        TreeNode node = bt.buildTree(preorder,inoreder);
        System.out.println(node);
    }
}
