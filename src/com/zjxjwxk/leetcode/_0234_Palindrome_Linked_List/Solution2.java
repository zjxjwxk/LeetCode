package com.zjxjwxk.leetcode._0234_Palindrome_Linked_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * 快慢指针+反转链表+恢复原链表
 *
 * @author Xinkang Wu
 * @date 2025/6/13 13:51
 */
public class Solution2 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode endOfFirstHalf = findEndOfFirstHalf(head);
        ListNode secondHalfHead = reverse(endOfFirstHalf.next);

        ListNode p1 = head, p2 = secondHalfHead;
        boolean ans = true;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                ans = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        endOfFirstHalf.next = reverse(secondHalfHead);
        return ans;
    }

    private ListNode findEndOfFirstHalf(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode newHead = null, p = head, next;
        while (p != null) {
            next = p.next;
            p.next = newHead;
            newHead = p;
            p = next;
        }
        return newHead;
    }
}
