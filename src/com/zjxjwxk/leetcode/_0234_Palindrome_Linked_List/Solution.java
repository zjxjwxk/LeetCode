package com.zjxjwxk.leetcode._0234_Palindrome_Linked_List;

import com.zjxjwxk.leetcode.util.ListNode;

/**
 * @author Xinkang Wu
 * @date 2020/10/23 9:47 上午
 */
public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode mid = findMid(head), newHead = mid.next;
        newHead = reverse(newHead);
        while (newHead != null) {
            if (head.val != newHead.val) {
                return false;
            }
            newHead = newHead.next;
            head = head.next;
        }
        return true;
    }

    private ListNode findMid(ListNode head) {
        ListNode ahead = head, behind = head;
        while (ahead.next != null && ahead.next.next != null) {
            ahead = ahead.next.next;
            behind = behind.next;
        }
        return behind;
    }

    private ListNode reverse(ListNode head) {
        ListNode newHead = null, next;
        while (head != null) {
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
