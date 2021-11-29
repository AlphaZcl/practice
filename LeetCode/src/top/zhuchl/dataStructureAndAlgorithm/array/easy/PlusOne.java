package top.zhuchl.dataStructureAndAlgorithm.array.easy;

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位，数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @Author AlphaZcl
 * @Date 2021/6/23
 **/
public class PlusOne {

    public int[] plusOne(int[] digits) {
        /*进位值，初始为1做加1操作*/
        int carry = 1;
        for(int i=digits.length-1;i>=0;i-- ){
            int sum = digits[i] + carry;
            carry = sum/10;
            digits[i] = sum%10;
            if (carry < 1){
                break;
            }
        }
        if(carry == 1){
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1,9,9,8};
        PlusOne po = new PlusOne();
        int[] res = po.plusOne(digits);
        System.out.println(Arrays.toString(res));
    }
}
