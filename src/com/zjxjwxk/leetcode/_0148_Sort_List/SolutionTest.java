package com.zjxjwxk.leetcode._0148_Sort_List;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortList1() {
        ListNode head = DSFactory.newLinkedList(new int[]{4, 2, 1, 3});
        ListNode ans = DSFactory.newLinkedList(new int[]{1, 2, 3, 4});
        assertEquals(ans, solution.sortList(head));
    }

    @Test
    void sortList2() {
        ListNode head = DSFactory.newLinkedList(new int[]{-1, 5, 3, 4, 0});
        ListNode ans = DSFactory.newLinkedList(new int[]{-1, 0, 3, 4, 5});
        assertEquals(ans, solution.sortList(head));
    }
}