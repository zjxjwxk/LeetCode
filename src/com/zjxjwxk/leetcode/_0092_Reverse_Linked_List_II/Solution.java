package com.zjxjwxk.leetcode._0092_Reverse_Linked_List_II;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 头插法
 *
 * @author Xinkang Wu
 * @date 2021/3/18 11:55
 */
public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode(0, head), p = dummyHead;
        for (int i = 0; i < left - 1; ++i) {
            p = p.next;
        }
        ListNode prev = p, newTail = p.next, newHead = null, next = null;
        p = p.next;
        for (int i = left; i <= right; ++i) {
            next = p.next;
            p.next = newHead;
            newHead = p;
            p = next;
        }
        prev.next = newHead;
        newTail.next = next;
        return dummyHead.next;
    }
}
