package top.zhuchl.dataStructureAndAlgorithm.tooffer.medium;

import java.util.Arrays;

/**
 * 给你一个整数数组 coins，表示不同面额的硬币；以及一个整数 amount，表示总金额。
 * 计算并返回可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回-1 。
 * 你可以认为每种硬币的数量是无限的。
 *
 * @Author AlphaZcl
 * @Date 2021/8/4
 **/
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length==0){
            return -1;
        }
        /*dp[i]：和为i的coin组合中硬币最少有dp[i]个*/
        int[] dp = new int[amount+1];
        /*dp初始值都设为最多需要多少枚*/
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i = 1;i<=amount;i++){
            /*i面额总值*/
            for (int j = 0; j < coins.length; j++) {
                /*每次遍历元素集合进行比较*/
                if (i>=coins[j]) {
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        CoinChange cc = new CoinChange();
        System.out.println(cc.coinChange(coins,amount));
    }
}
