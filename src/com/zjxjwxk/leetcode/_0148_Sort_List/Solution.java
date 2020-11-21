package com.zjxjwxk.leetcode._0148_Sort_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 归并排序
 * @author Xinkang Wu
 * @date 2020/11/21 11:01
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            ++len;
            temp = temp.next;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        for (int subLength = 1; subLength < len; subLength <<= 1) {
            ListNode pre = dummyHead, head1, head2, cur = pre.next, nextHead;
            while (cur != null && cur.next != null) {
                head1 = cur;
                for (int i = 0; i < subLength - 1 && cur.next != null; ++i) {
                    cur = cur.next;
                }
                if (cur.next != null) {
                    head2 = cur.next;
                    cur.next = null;
                    cur = head2;
                    for (int i = 0; i < subLength - 1 && cur.next != null; ++i) {
                        cur = cur.next;
                    }
                    nextHead = cur.next;
                    cur.next = null;
                    pre.next = merge(head1, head2);
                    while (pre.next != null) {
                        pre = pre.next;
                    }
                    pre.next = nextHead;
                    cur = nextHead;
                }
            }
        }
        return dummyHead.next;
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(), pre = dummyHead;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                pre.next = head1;
                head1 = head1.next;
            } else {
                pre.next = head2;
                head2 = head2.next;
            }
            pre = pre.next;
        }
        if (head1 != null) {
            pre.next = head1;
        }
        if (head2 != null) {
            pre.next = head2;
        }
        return dummyHead.next;
    }
}
