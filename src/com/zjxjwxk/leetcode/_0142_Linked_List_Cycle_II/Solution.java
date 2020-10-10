package com.zjxjwxk.leetcode._0142_Linked_List_Cycle_II;

/**
 * @author zjxjwxk
 * @date 2020/10/10 8:10 上午
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode meeting = meetingNode(head);
        if (meeting == null) {
            return null;
        }
        int count = 1;
        ListNode temp = meeting;
        while (temp.next != meeting) {
            temp = temp.next;
            ++count;
        }
        ListNode behind = head, ahead = head;
        while (count != 0) {
            ahead = ahead.next;
            --count;
        }
        while (ahead != behind) {
            ahead = ahead.next;
            behind = behind.next;
        }
        return ahead;
    }

    private ListNode meetingNode(ListNode head) {
        ListNode behind = head, ahead = head;
        while (ahead != null && ahead.next != null) {
            ahead = ahead.next.next;
            behind = behind.next;
            if (ahead == behind) {
                return ahead;
            }
        }
        return null;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
