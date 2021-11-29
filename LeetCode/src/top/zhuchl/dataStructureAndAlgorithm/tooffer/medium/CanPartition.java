package top.zhuchl.dataStructureAndAlgorithm.tooffer.medium;

import java.util.Arrays;

/**
 * 给你一个只包含正整数的非空数组nums。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 *
 * @Author AlphaZcl
 * @Date 2021/8/2
 **/
public class CanPartition {

    public boolean canPartition(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum & 1) == 1) {
            return false;
        }
        int target = sum >> 1;
        /*dp[i][j]在前i个元素中，是否可以选若干个元素使得其和为j的结果*/
        boolean[][] dp = new boolean[nums.length][target+1];
        /*初始化值,所有值都不取，和为0*/
        for(int i = 0;i<nums.length;i++){
            dp[i][0] = true;
        }
        /*只取第一个元素的值*/
        dp[0][nums[0]] = true;
        /*依次判断后续元素*/
        for(int i=1;i<nums.length;i++){
            for(int j= 0;j<=target;j++){
                if(j>=nums[i]){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[nums.length-1][target];
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        CanPartition cp = new CanPartition();
        System.out.println(cp.canPartition(arr));
        System.out.println(Arrays.toString(arr));

    }
}
