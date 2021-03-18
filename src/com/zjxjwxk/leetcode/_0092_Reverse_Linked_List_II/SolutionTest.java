package com.zjxjwxk.leetcode._0092_Reverse_Linked_List_II;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseBetween1() {
        ListNode head = DSFactory.newListNode(new int[]{1, 2, 3, 4, 5});
        int left = 2, right = 4;
        ListNode ans = DSFactory.newListNode(new int[]{1, 4, 3, 2, 5});
        assertEquals(ans, solution.reverseBetween(head, left, right));
    }

    @Test
    void reverseBetween2() {
        ListNode head = DSFactory.newListNode(new int[]{5});
        int left = 1, right = 1;
        ListNode ans = DSFactory.newListNode(new int[]{5});
        assertEquals(ans, solution.reverseBetween(head, left, right));
    }

    @Test
    void reverseBetween3() {
        ListNode head = DSFactory.newListNode(new int[]{3, 5});
        int left = 1, right = 2;
        ListNode ans = DSFactory.newListNode(new int[]{5, 3});
        assertEquals(ans, solution.reverseBetween(head, left, right));
    }
}