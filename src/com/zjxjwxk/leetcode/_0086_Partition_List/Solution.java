package com.zjxjwxk.leetcode._0086_Partition_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/1/3 14:01
 */
public class Solution {

    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        ListNode smallHead = new ListNode();
        ListNode largeHead = new ListNode();
        ListNode small = smallHead;
        ListNode large = largeHead;
        while (p != null) {
            if (p.val < x) {
                small.next = p;
                small = small.next;
            } else {
                large.next = p;
                large = large.next;
            }
            p = p.next;
        }
        small.next = largeHead.next;
        large.next = null;
        return smallHead.next;
    }
}
