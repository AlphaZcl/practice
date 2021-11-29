package top.zhuchl.dataStructureAndAlgorithm.tooffer.medium;

import java.util.*;

/**
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，
 * 使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 *
 * @Author AlphaZcl
 * @Date 2021/7/29
 **/
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answers = new ArrayList<>();
        if(nums == null ||nums.length<3){
            return answers;
        }
        /*排序*/
        sort(nums, 0, nums.length - 1);

        for(int i=0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length - 1;
            if(nums[i]>0){
                return answers;
            }
            if(i>0&&nums[i] == nums[i-1]){
                continue;
            }
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    answers.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    /*剔除重复数字*/
                    while(left <right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    /*继续查找*/
                    left++;
                    right--;
                }
            }
        }
        return answers;
    }

    private void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left, j = right;
        int baseVal = arr[left];
        while (i < j) {
            while (i < j && arr[j] > baseVal) {
                j--;
            }
            if (i < j) {
                arr[i++] = arr[j];
            }
            while (i < j && arr[i] < baseVal) {
                i++;
            }
            if (i < j) {
                arr[j--] = arr[i];
            }
        }
        arr[i] = baseVal;
        /*左递归*/
        sort(arr, left, i - 1);
        /*右递归*/
        sort(arr, i + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        ThreeSum ts = new ThreeSum();
        ts.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        List list = ts.threeSum(arr);
        System.out.println(list);
    }
}
