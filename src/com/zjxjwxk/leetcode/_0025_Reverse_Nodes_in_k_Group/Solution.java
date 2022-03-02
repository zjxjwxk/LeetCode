package com.zjxjwxk.leetcode._0025_Reverse_Nodes_in_k_Group;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 迭代
 * @author Xinkang Wu
 * @date 2022/3/2 15:13
 */
public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p = head, dummyHead = new ListNode(), preTail = dummyHead;
        dummyHead.next = head;
        while (p != null) {
            ListNode newHead = p, newTail = p;
            if (!ifReverse(p, k)) {
                preTail.next = newHead;
                break;
            }
            p = p.next;
            newTail.next = null;
            for (int i = 1; i < k && p != null; ++i) {
                ListNode next = p.next;
                p.next = newHead;
                newHead = p;
                p = next;
            }
            preTail.next = newHead;
            preTail = newTail;
        }
        return dummyHead.next;
    }

    private boolean ifReverse(ListNode p, int k) {
        for (int i = 0; i < k; ++i) {
            if (p == null) {
                return false;
            }
            p = p.next;
        }
        return true;
    }
}
