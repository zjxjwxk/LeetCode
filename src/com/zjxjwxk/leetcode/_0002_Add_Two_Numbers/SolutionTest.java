package com.zjxjwxk.leetcode._0002_Add_Two_Numbers;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void addTwoNumbers() {
        ListNode l1 = DSFactory.newListNode(new int[]{2, 4, 3});
        ListNode l2 = DSFactory.newListNode(new int[]{5, 6, 4});
        ListNode ans = DSFactory.newListNode(new int[]{7, 0, 8});
        assertEquals(ans, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbers2() {
        ListNode l1 = DSFactory.newListNode(new int[]{0});
        ListNode l2 = DSFactory.newListNode(new int[]{0});
        ListNode ans = DSFactory.newListNode(new int[]{0});
        assertEquals(ans, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbers3() {
        ListNode l1 = DSFactory.newListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = DSFactory.newListNode(new int[]{9, 9, 9, 9});
        ListNode ans = DSFactory.newListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        assertEquals(ans, solution.addTwoNumbers(l1, l2));
    }
}