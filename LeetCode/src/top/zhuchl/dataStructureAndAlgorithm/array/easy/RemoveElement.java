package top.zhuchl.dataStructureAndAlgorithm.array.easy;

/**
 *
 * 给你一个数组 nums和一个值 val，你需要原地移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 *
 * @Author AlphaZcl
 * @Date 2021/6/10
 **/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int fast=0,slow=0;
        while(fast < nums.length){
            if(nums[fast]!=val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        RemoveElement solution03 = new RemoveElement();
        int len = solution03.removeElement(arr,2);
        System.out.println(len);
    }
}
