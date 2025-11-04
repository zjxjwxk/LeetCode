package com.zjxjwxk.leetcode._0061_Rotate_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 首尾相连
 *
 * @author Xinkang Wu
 * @date 2025/11/4 22:55
 */
public class Solution2 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 0;
        ListNode dummyHead = new ListNode(0, head), p = dummyHead, tail, newHead;
        while (p.next != null) {
            ++len;
            p = p.next;
        }
        tail = p;
        k = len - k % len;
        if (k == len) {
            return head;
        }
        p = dummyHead;
        for (int i = 0; i < k; ++i) {
            p = p.next;
        }
        newHead = p.next;
        p.next = null;
        tail.next = head;
        return newHead;
    }
}
