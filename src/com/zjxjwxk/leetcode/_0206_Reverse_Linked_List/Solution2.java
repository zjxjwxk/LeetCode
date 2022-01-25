package com.zjxjwxk.leetcode._0206_Reverse_Linked_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 递归
 * @author Xinkang Wu
 * @date 2020/9/23 6:39 下午
 */
public class Solution2 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
