package com.zjxjwxk.leetcode._0203_Remove_LinkedList_Elements;

/**
 * @author zjxjwxk
 */
public class Solution2 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNoe = prev.next;
                prev.next = delNoe.next;
                delNoe.next = null;
            } else {
                prev = prev.next;
            }
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        (new Solution2()).removeElements(head, 6);
        System.out.println(head);
    }
}