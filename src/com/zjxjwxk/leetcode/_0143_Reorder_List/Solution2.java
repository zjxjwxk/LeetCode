package com.zjxjwxk.leetcode._0143_Reorder_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 寻找链表中点 + 链表逆序 + 合并链表
 * @author Xinkang Wu
 * @date 2020/10/20 12:20 下午
 */
public class Solution2 {

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode mid = findMid(head);
        ListNode q = mid.next;
        mid.next = null;
        q = reverseList(q);
        insertList(head, q);
    }

    private ListNode findMid(ListNode head) {
        ListNode ahead = head, behind = head;
        while (ahead.next != null && ahead.next.next != null) {
            ahead = ahead.next.next;
            behind = behind.next;
        }
        return behind;
    }

    private ListNode reverseList(ListNode head) {
        ListNode p = head, newHead = null, next;
        while (p != null) {
            next = p.next;
            p.next = newHead;
            newHead = p;
            p = next;
        }
        return newHead;
    }

    private void insertList(ListNode p, ListNode q) {
        ListNode next;
        while (q != null) {
            next = q.next;
            q.next = p.next;
            p.next = q;
            p = q.next;
            q = next;
        }
    }
}
