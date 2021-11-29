package top.zhuchl.dataStructureAndAlgorithm.array.easy;

import java.util.Arrays;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 初始化nums1和nums2的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，
 * 这样它就有足够的空间保存来自 nums2 的元素。
 *
 * @Author AlphaZcl
 * @Date 2021/6/24
 **/
public class Merge {

    public void merge(int[] nums1,int m,int[] nums2,int n){
        int len = m + n - 1;
        int len1 = m - 1;
        int len2 = n -1;
        while(len1 >=0 && len2 >=0){
            if(nums1[len1] > nums2[len2]){
                nums1[len--] = nums1[len1--];
            }else{
                nums1[len--] = nums2[len2--];
            }
        }
        /*复制剩余的nums2到nums1头*/
        System.arraycopy(nums2,0,nums1,0,len2+1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {};
        Merge m = new Merge();
        m.merge(nums1,1,nums2,0);
        System.out.println(Arrays.toString(nums1));
    }
}
