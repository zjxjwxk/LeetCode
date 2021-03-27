package com.zjxjwxk.leetcode._0061_Rotate_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 快慢指针
 * @author Xinkang Wu
 * @date 2021/3/27 00:55
 */
public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode ahead = head, behind = head, p = head;
        int count = 0;
        while (p != null) {
            ++count;
            p = p.next;
        }
        k %= count;
        if (k == 0) {
            return head;
        }
        while (k-- != 0) {
            ahead = ahead.next;
        }
        while (ahead.next != null) {
            ahead = ahead.next;
            behind = behind.next;
        }
        ListNode newHead = behind.next;
        behind.next = null;
        ahead.next = head;
        return newHead;
    }
}
