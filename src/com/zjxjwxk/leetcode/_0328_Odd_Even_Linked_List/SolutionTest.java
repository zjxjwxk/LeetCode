package com.zjxjwxk.leetcode._0328_Odd_Even_Linked_List;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void oddEvenList1() {
        int[] headArr = {1, 2, 3, 4, 5}, ansArr = {1, 3, 5, 2, 4};
        ListNode head = DSFactory.newLinkedList(headArr);
        ListNode ans = DSFactory.newLinkedList(ansArr);
        ListNode result = solution.oddEvenList(head);
        assertEquals(ans, result);
    }

    @Test
    void oddEvenList2() {
        int[] headArr = {2, 1, 3, 5, 6, 4, 7}, ansArr = {2, 3, 6, 7, 1, 5, 4};
        ListNode head = DSFactory.newLinkedList(headArr);
        ListNode ans = DSFactory.newLinkedList(ansArr);
        ListNode result = solution.oddEvenList(head);
        assertEquals(ans, result);
    }
}