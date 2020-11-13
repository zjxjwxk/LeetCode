package com.zjxjwxk.leetcode._0328_Odd_Even_Linked_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 双指针
 * @author Xinkang Wu
 * @date 2020/11/13 11:05 上午
 */
public class Solution {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next, p1 = head, p2 = newHead;
        while (p2 != null && p2.next != null) {
            p1.next = p2.next;
            p1 = p1.next;
            p2.next = p1.next;
            p2 = p2.next;
        }
        p1.next = newHead;
        return head;
    }
}
