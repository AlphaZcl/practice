package top.zhuchl.dataStructureAndAlgorithm.array.easy;

import top.zhuchl.dataStructureAndAlgorithm.array.easy.datastructure.sortedarraytobst.TreeNode;

/**
 * @Author AlphaZcl
 * @Date 2021/6/25
 **/
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums,0,nums.length-1);
    }

    private TreeNode buildTree(int[] nums,int start,int end){
        if(start > end){
            return null;
        }
        int mid = start + ((end - start)>>1);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums,start,mid-1);
        root.right = buildTree(nums,mid+1,end);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {1,3};
        SortedArrayToBST s = new SortedArrayToBST();
        System.out.println(s.sortedArrayToBST(nums));
    }
}
