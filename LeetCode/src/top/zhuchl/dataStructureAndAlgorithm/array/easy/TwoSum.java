package top.zhuchl.dataStructureAndAlgorithm.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 你可以按任意顺序返回答案
 *
 * @Author AlphaZcl
 * @Date 2021/5/21
 **/
public class TwoSum {

    /**
     * 暴力破解
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]+ nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }

    /**
     * 顺序扫描数组，对每一个元素，在 map 中找能组合给定值的另一半数字，如果找到了，直接返回 2个数字的下标即可。
     * 如果找不到，就把这个数字存入 map 中，等待扫到“另一半”数字的时候，再取出来返回结果。
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums,int target){
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
                continue;
            }
            map.put(nums[i],i);
        }
        return res;
    }


    public static void main(String[] args) {
        TwoSum solution01 = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = solution01.twoSum2(nums,target);
        System.out.println(Arrays.toString(res));
    }
}
