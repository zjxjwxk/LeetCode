package com.zjxjwxk.leetcode._0025_Reverse_Nodes_in_k_Group;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * @author Xinkang Wu
 * @date 2023/12/18 21:49
 */
public class Solution2 {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p = head, newHead = null, next = null;
        for (int i = 0; i < k - 1 && p != null; ++i) {
            p = p.next;
        }
        if (p == null) {
            return head;
        }
        p = head;
        for (int i = 0; i < k; ++i) {
            next = p.next;
            p.next = newHead;
            newHead = p;
            p = next;
        }
        head.next = reverseKGroup(next, k);
        return newHead;
    }
}
