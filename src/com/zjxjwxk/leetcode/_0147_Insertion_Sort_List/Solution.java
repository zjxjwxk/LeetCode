package com.zjxjwxk.leetcode._0147_Insertion_Sort_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * @author Xinkang Wu
 * @date 2020/11/20 10:30
 */
public class Solution {

    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode p = head.next, q, pre = head;
        while (p != null) {
            if (p.val >= pre.val) {
                p = p.next;
                pre = pre.next;
            } else {
                q = dummyHead;
                while (q.next.val < p.val) {
                    q = q.next;
                }
                pre.next = p.next;
                p.next = q.next;
                q.next = p;
                p = pre.next;
            }
        }
        return dummyHead.next;
    }
}
