package com.zjxjwxk.leetcode._0143_Reorder_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 从尾结点到中间结点，递归插入
 * @author Xinkang Wu
 * @date 2020/10/20 9:14 上午
 */
public class Solution {

    private ListNode p;

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode dummyHead = new ListNode(), ahead = dummyHead, behind = dummyHead;
        dummyHead.next = head;
        while (ahead != null && ahead.next != null) {
            ahead = ahead.next.next;
            behind = behind.next;
        }
        ListNode q = behind.next;
        behind.next = null;
        this.p = head;
        reverseInsert(q);
    }

    private void reverseInsert(ListNode q) {
        if (q == null) {
            return;
        }
        reverseInsert(q.next);
        q.next = this.p.next;
        this.p.next = q;
        this.p = q.next;
    }
}
