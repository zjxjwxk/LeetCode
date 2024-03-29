package com.zjxjwxk.leetcode._0206_Reverse_Linked_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * @author Xinkang Wu
 * @date 2020/9/23 6:39 下午
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = next;
        }
        return newHead;
    }
}
