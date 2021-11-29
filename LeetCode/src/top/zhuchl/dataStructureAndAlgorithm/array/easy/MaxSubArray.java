package top.zhuchl.dataStructureAndAlgorithm.array.easy;

/**
 *给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 *
 * @Author AlphaZcl
 * @Date 2021/6/23
 **/
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        /*当前最大子序和*/
        int sum = 0;
        /*子序最大结果值，初始为第一个元素值*/
        int ans = nums[0];
        for(int num : nums){
            if(sum > 0){
                /*sum大于0，对ans来说有增益效果，继续累加当前值*/
                sum += num;
            }else{
                /*sum小于0，对ans来说无增益效果，将当前元素赋值给sum*/
                sum = num;
            }
            /*已累加的值和上次结果进行比较取大*/
            ans = Math.max(sum,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxSubArray m = new MaxSubArray();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = m.maxSubArray(arr);
        System.out.println(max);
    }
}
