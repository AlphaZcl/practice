package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法
 *
 * @Author AlphaZcl
 * @Date 2021/7/8
 **/
public class NumWays {

    public int numWays(int n) {
        int pre =1,post = 1,sum=0;
        for(int i =0;i<n;i++){
            sum = (pre+post)%1000000007;
            pre = post;
            post = sum;
        }
        return pre;
    }

    public static void main(String[] args) {
        NumWays nw = new NumWays();
        int n =7;
        System.out.println(nw.numWays(n));
    }
}
