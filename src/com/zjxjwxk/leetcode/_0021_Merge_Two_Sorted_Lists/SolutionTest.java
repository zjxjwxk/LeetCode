package com.zjxjwxk.leetcode._0021_Merge_Two_Sorted_Lists;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mergeTwoLists() {
        ListNode l1 = DSFactory.newListNode(new int[]{1, 2, 4});
        ListNode l2 = DSFactory.newListNode(new int[]{1, 3, 4});
        ListNode ans = DSFactory.newListNode(new int[]{1, 1, 2, 3, 4, 4});
        assertEquals(ans, solution.mergeTwoLists(l1, l2));
    }

    @Test
    void mergeTwoLists2() {
        ListNode l1 = null;
        ListNode l2 = null;
        assertNull(solution.mergeTwoLists(l1, l2));
    }

    @Test
    void mergeTwoLists3() {
        ListNode l1 = null;
        ListNode l2 = DSFactory.newListNode(new int[]{0});
        ListNode ans = DSFactory.newListNode(new int[]{0});
        assertEquals(ans, solution.mergeTwoLists(l1, l2));
    }
}