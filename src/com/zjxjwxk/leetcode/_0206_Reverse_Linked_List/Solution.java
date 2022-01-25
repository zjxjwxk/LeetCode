package com.zjxjwxk.leetcode._0206_Reverse_Linked_List;

/**
 * @author Xinkang Wu
 * @date 2020/9/23 6:39 下午
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = next;
        }
        return newHead;
    }

    private void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }

    private ListNode createLinkedList(int num) {
        ListNode head = new ListNode(0), temp = head;
        for (int i = 1; i <= num; ++i) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = solution.createLinkedList(5);
        solution.printLinkedList(head);
        head = solution.reverseList(head);
        solution.printLinkedList(head);
    }

    /**
     * Definition for singly-linked list.
     */
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
