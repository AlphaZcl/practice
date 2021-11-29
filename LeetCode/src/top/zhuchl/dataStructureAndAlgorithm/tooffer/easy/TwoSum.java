package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个已按照升序排列的整数数组numbers ，请你从数组中找出两个数满足相加之和等于目标数target 。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，
 * 所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 * @Author AlphaZcl
 * @Date 2021/7/29
 **/
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<numbers.length;i++){
            int num = target - numbers[i];
            if(map.containsKey(num)){
                int idx = map.get(num);
                res[0] = i >idx? idx : i;
                res[1] = res[0] == i ? idx : i;
                res[0]++;
                res[1]++;
                break;
            }
            map.put(numbers[i],i);
        }
        return res;
    }

    public int[] twoSum2(int[] numbers,int target){
        int[] answers = new int[2];
        int left = 0;
        int right  = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum > target ){
                right--;
            }else if(sum < target){
                left++;
            }else{
                answers[0] = left+1;
                answers[1] = right+1;
                break;
            }
        }
        return answers;
    }
}
