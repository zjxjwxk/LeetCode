package com.zjxjwxk.leetcode._0148_Sort_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 自底向上归并排序
 *
 * @author Xinkang Wu
 * @date 2020/11/21 11:01
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        int count = 0;
        ListNode dummyHead = new ListNode(0, head), p = head;
        while (p != null) {
            ++count;
            p = p.next;
        }
        for (int len = 1; len < count; len <<= 1) {
            p = dummyHead;
            ListNode preTail = dummyHead, next = null;
            while (p.next != null) {
                ListNode list1 = p.next;
                for (int i = 0; i < len && p.next != null; ++i) {
                    p = p.next;
                }
                if (p.next == null) {
                    break;
                }
                ListNode list2 = p.next;
                p.next = null;
                p = list2;
                for (int i = 0; i < len - 1 && p.next != null; ++i) {
                    p = p.next;
                }
                next = p.next;
                p.next = null;
                ListNode newHead = mergeList(list1, list2);
                preTail.next = newHead;
                while (preTail.next != null) {
                    preTail = preTail.next;
                }
                preTail.next = next;
                p = preTail;
            }
        }
        return dummyHead.next;
    }

    private ListNode mergeList(ListNode head1, ListNode head2) {
        ListNode p1 = head1, p2 = head2, dummyHead = new ListNode(), tail = dummyHead;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                tail.next = p1;
                p1 = p1.next;
            } else {
                tail.next = p2;
                p2 = p2.next;
            }
            tail = tail.next;
        }
        if (p1 != null) {
            tail.next = p1;
        } else {
            tail.next = p2;
        }
        return dummyHead.next;
    }
}
