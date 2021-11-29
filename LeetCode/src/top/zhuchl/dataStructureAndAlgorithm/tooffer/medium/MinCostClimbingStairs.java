package top.zhuchl.dataStructureAndAlgorithm.tooffer.medium;

import java.util.Arrays;

/**
 * 数组的每个下标作为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值cost[i]（下标从 0 开始）。
 * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 *
 *
 * @Author AlphaZcl
 * @Date 2021/8/6
 **/
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        if(cost == null || cost.length<=1){
            return 0;
        }
        /*状态定义：dp[i]，上到台阶i所需要的最小花费*/
        int[] dp = new int[cost.length];

        /*初始化dp*/
        dp[0] = 0;
        dp[1] = Math.min(cost[0],cost[1]);
        for(int i=2;i<cost.length;i++){
            dp[i] = Math.min(dp[i-1]+cost[i],dp[i-2]+cost[i-1]);
        }
        return dp[cost.length-1];
    }

    public static void main(String[] args) {
        int[] cost = {10,15,20};
        MinCostClimbingStairs mccs = new MinCostClimbingStairs();
        System.out.println(mccs.minCostClimbingStairs(cost));
    }
}
