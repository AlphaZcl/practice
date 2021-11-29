package top.zhuchl.dataStructureAndAlgorithm.tooffer.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含n 个整数的数组nums和一个目标值target，判断nums中是否存在四个元素 a，b，c和 d，
 * 使得a + b + c + d的值与target相等？找出所有满足条件且不重复的四元组。
 * 注意：答案中不可以包含重复的四元组。
 *
 * @Author AlphaZcl
 * @Date 2021/7/30
 **/
public class FourNums {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answers = new ArrayList<>();
        if(nums == null || nums.length <4){
            return answers;
        }
        /*排序*/
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            /*去重*/
            if(i>0 &&nums[i] == nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums.length-j<3){
                    break;
                }
                /*去重*/
                if(j>i+1&&nums[j] == nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum>target){
                        right--;
                    }else if (sum<target){
                        left++;
                    }else{
                        answers.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        /*去重*/
                        while(left<right&&nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right&&nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,1,2,2};
        FourNums fn = new FourNums();
        List list = fn.fourSum(nums,0);
        System.out.println(list);
    }
}
