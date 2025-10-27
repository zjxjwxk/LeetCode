package com.zjxjwxk.leetcode._0141_Linked_List_Cycle;

import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void hasCycle() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void hasCycle2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void hasCycle3() {
        ListNode head = new ListNode(1);
        assertFalse(solution.hasCycle(head));
    }
}