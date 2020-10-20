package com.zjxjwxk.leetcode._0143_Reorder_List;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void reorderList1() {
        int[] linkedListArr = {1, 2, 3, 4}, ansArr = {1, 4, 2, 3};
        ListNode head = DSFactory.newLinkedList(linkedListArr);
        ListNode ans = DSFactory.newLinkedList(ansArr);
        solution2.reorderList(head);
        assertEquals(ans, head);
    }

    @Test
    void reorderList2() {
        int[] linkedListArr = {1, 2, 3, 4, 5}, ansArr = {1, 5, 2, 4, 3};
        ListNode head = DSFactory.newLinkedList(linkedListArr);
        ListNode ans = DSFactory.newLinkedList(ansArr);
        solution2.reorderList(head);
        assertEquals(ans, head);
    }

    @Test
    void reorderList3() {
        int[] linkedListArr = {1}, ansArr = {1};
        ListNode head = DSFactory.newLinkedList(linkedListArr);
        ListNode ans = DSFactory.newLinkedList(ansArr);
        solution2.reorderList(head);
        assertEquals(ans, head);
    }

    @Test
    void reorderList4() {
        int[] linkedListArr = {}, ansArr = {};
        ListNode head = DSFactory.newLinkedList(linkedListArr);
        ListNode ans = DSFactory.newLinkedList(ansArr);
        solution2.reorderList(head);
        assertEquals(ans, head);
    }
}