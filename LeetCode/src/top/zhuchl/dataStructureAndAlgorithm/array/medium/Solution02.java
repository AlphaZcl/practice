package top.zhuchl.dataStructureAndAlgorithm.array.medium;

/**
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0之外，这两个数都不会以 0开头。
 *
 * @Author AlphaZcl
 * @Date 2021/5/21
 **/
public class Solution02 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = new ListNode();
        ListNode helper = sumNode;
        /*位和*/
        int sum = 0;
        /*进位数*/
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            sum = val1 + val2 + carry;
            carry = sum / 10;
            helper.val = sum % 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if(l1 == null && l2 == null){
                /*末尾相加完毕，退出*/
                break;
            }
            helper.next = new ListNode();
            helper = helper.next;
        }

        if(carry == 1){
            /*最后一位相加进位*/
            helper.next = new ListNode(carry);
        }
        return sumNode;
    }

    public static void main(String[] args) {
        Solution02 solution02 = new Solution02();
        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = {9,9,9,9};
        ListNode l1 = getListNode(arr1);
        ListNode l2 = getListNode(arr2);
        ListNode sumNode = solution02.addTwoNumbers(l1,l2);
        System.out.println(sumNode.toString());
    }

    private static ListNode getListNode(int arr[]) {
        ListNode head = new ListNode();
        ListNode helper = head;
        for (int i = 0; i < arr.length; i++) {
            helper.val = arr[i];
            if (i != arr.length - 1) {
                helper.next = new ListNode();
                helper = helper.next;
            }
        }
        return head;
    }
}

class ListNode {

    int val;

    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        ListNode helper = this;
        while (helper != null) {
            stringBuilder.append(helper.val);
            helper = helper.next;
            if (helper != null) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
