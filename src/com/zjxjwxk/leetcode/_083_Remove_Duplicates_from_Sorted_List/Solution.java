package com.zjxjwxk.leetcode._083_Remove_Duplicates_from_Sorted_List;

/**
 * 直接遍历
 * @author zjxjwxk
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
