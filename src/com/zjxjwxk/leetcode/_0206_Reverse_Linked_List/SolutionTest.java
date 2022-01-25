package com.zjxjwxk.leetcode._0206_Reverse_Linked_List;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseList1() {
        ListNode head = DSFactory.newLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode ans = DSFactory.newLinkedList(new int[]{5, 4, 3, 2, 1});
        assertEquals(ans, solution.reverseList(head));
    }

    @Test
    void reverseList2() {
        ListNode head = DSFactory.newLinkedList(new int[]{1, 2});
        ListNode ans = DSFactory.newLinkedList(new int[]{2, 1});
        assertEquals(ans, solution.reverseList(head));
    }
}