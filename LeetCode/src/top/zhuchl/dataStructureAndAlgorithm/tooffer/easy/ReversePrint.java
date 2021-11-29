package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

import top.zhuchl.dataStructureAndAlgorithm.tooffer.datastructure.reverseprint.ListNode;

import java.util.Arrays;

/**
 *输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * @Author AlphaZcl
 * @Date 2021/6/30
 **/
public class ReversePrint {

    int[] resArr;
    int i = 0;
    int j = 0;
    public int[] reversePrint(ListNode head) {
        build(head);
        return resArr;
    }

    private void build(ListNode node){
        if(node == null){
            resArr = new int[i];
            return;
        }
        i++;
        build(node.next);
        resArr[j++] = node.val;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        ReversePrint rp = new ReversePrint();
        int[] arr = rp.reversePrint(head);
        System.out.println(Arrays.toString(arr));
    }
}
