package com.zjxjwxk.leetcode._203_Remove_LinkedList_Elements;

/**
 * @author zjxjwxk
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head == null) {
            return null;
        }

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNoe = prev.next;
                prev.next = delNoe.next;
                delNoe.next = null;
            } else {
                prev = prev.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        (new Solution()).removeElements(head, 6);
        System.out.println(head);
    }
}