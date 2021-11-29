package top.zhuchl.dataStructureAndAlgorithm.array.easy;

import java.util.HashMap;

/**
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，
 * 返回它将会被按顺序插入的位置。你可以假设数组中无重复元素。
 *
 * @Author AlphaZcl
 * @Date 2021/6/11
 **/
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 二分法进行查找
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int[] nums, int target){
        int left = 0,right = nums.length-1;
        while(left <= right){
            int mid = (left+right)>>1;
            if(target <nums[mid]){
                right = mid -1;
            }else if(target>nums[mid]){
                left = mid + 1;
            }else{
                return left;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        SearchInsertPosition sip = new SearchInsertPosition();
        int position = sip.searchInsert2(arr,5);
        System.out.println(position);

    }
}
