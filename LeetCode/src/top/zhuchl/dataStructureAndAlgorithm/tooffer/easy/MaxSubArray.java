package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

/**
 * 给定一个整数数组nums，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * @Author AlphaZcl
 * @Date 2021/7/31
 **/
public class MaxSubArray {


    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        int res = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            if(dp[i-1] > 0){
                dp[i] = dp[i-1] + nums[i];
            }else{
                dp[i] = nums[i];
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
