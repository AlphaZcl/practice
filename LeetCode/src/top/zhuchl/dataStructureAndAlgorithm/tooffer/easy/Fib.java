package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

/**
 * 斐波那契数列，写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）
 *
 * @Author AlphaZcl
 * @Date 2021/7/7
 **/
public class Fib {

    public int fib(int n){
        int pre = 0,post = 1,sum=0;
        for(int i=0;i<n;i++){
            sum = (pre+post)%100000007;
            pre = post;
            post = sum;
        }
        return pre;
    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        System.out.println(fib.fib(5));
    }
}
