package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

/**
 * 泰波那契序列Tn定义如下：
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 给你整数n，请返回第 n 个泰波那契数Tn 的值。
 *
 * @Author AlphaZcl
 * @Date 2021/8/4
 **/
public class Tribonacci {

    public int tribonacci(int n) {
        int pre=0,mid=1,post=1,sum=0;
        for(int i=0;i<n;i++){
            sum = pre + mid + post;
            pre = mid;
            mid = post;
            post = sum;
        }
        return pre;
    }

    public static void main(String[] args) {
        int n = 25;
        Tribonacci t = new Tribonacci();
        System.out.println(t.tribonacci(n));
    }
}
