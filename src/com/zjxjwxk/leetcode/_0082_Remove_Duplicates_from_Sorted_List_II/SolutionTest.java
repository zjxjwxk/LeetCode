package com.zjxjwxk.leetcode._0082_Remove_Duplicates_from_Sorted_List_II;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void deleteDuplicates1() {
        ListNode head = DSFactory.newLinkedList(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode ans = DSFactory.newLinkedList(new int[]{1, 2, 5});
        assertEquals(ans, solution.deleteDuplicates(head));
    }

    @Test
    void deleteDuplicates2() {
        ListNode head = DSFactory.newLinkedList(new int[]{1, 1, 1, 2, 3});
        ListNode ans = DSFactory.newLinkedList(new int[]{2, 3});
        assertEquals(ans, solution.deleteDuplicates(head));
    }

    @Test
    void deleteDuplicates3() {
        ListNode head = DSFactory.newLinkedList(new int[]{});
        ListNode ans = DSFactory.newLinkedList(new int[]{});
        assertEquals(ans, solution.deleteDuplicates(head));
    }
}