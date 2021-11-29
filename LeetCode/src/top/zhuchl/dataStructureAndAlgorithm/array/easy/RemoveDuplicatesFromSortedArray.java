package top.zhuchl.dataStructureAndAlgorithm.array.easy;

/**
 *
 * 给你一个有序数组 nums ，请你原地删除重复出现的元素，使每个元素只出现一次，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * @Author AlphaZcl
 * @Date 2021/6/9
 **/
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        /*双指针，快慢指针*/
        int p=0,q=1 ;
        while(q < nums.length){
            /*p、q位置的数相等，q往后移，p、q位置的数不等，将q位置的值赋给p+1，同时移动两个指针*/
            if(nums[p] != nums[q]){
                nums[p+1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        RemoveDuplicatesFromSortedArray solution02 = new RemoveDuplicatesFromSortedArray();
        int len = solution02.removeDuplicates(arr);
        System.out.println(len);
    }
}
