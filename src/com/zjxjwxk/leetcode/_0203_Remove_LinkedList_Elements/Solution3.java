package com.zjxjwxk.leetcode._0203_Remove_LinkedList_Elements;

/**
 * @author zjxjwxk
 */
public class Solution3 {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        (new Solution3()).removeElements(head, 6);
        System.out.println(head);
    }
}