package com.zjxjwxk.leetcode._0092_Reverse_Linked_List_II;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * @author Xinkang Wu
 * @date 2021/3/18 11:55
 */
public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        for (int i = 0; i < left - 1; ++i) {
            pre = pre.next;
        }
        ListNode behind = pre;
        for (int i = 0; i < right - left + 2; ++i) {
            behind = behind.next;
        }
        ListNode newHead = pre.next, newTail = newHead, p = newHead.next, temp;
        while (p != behind) {
            temp = p.next;
            p.next = newHead;
            newHead = p;
            p = temp;
        }
        pre.next = newHead;
        newTail.next = behind;
        return dummyHead.next;
    }
}
