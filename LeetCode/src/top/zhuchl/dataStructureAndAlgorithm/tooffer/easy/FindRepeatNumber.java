package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

import java.util.Set;
import java.util.TreeSet;

/**
 *在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * @Author AlphaZcl
 * @Date 2021/6/30
 **/
public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> numSet = new TreeSet<>();
        for(int num : nums){
            if(!numSet.add(num)){
                return num;
            }
            numSet.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,0,1,2,3};
        FindRepeatNumber f = new FindRepeatNumber();
        System.out.println(f.findRepeatNumber(nums));
    }
}
