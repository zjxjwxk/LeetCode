package com.zjxjwxk.leetcode._0024_Swap_Nodes_in_Pairs;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void swapPairs() {
        int[] arr = {1, 2, 3, 4}, ans = {2, 1, 4, 3};
        ListNode head = DSFactory.newLinkedList(arr);
        head = solution.swapPairs(head);
        ListNode ansHead = DSFactory.newLinkedList(ans);
        assertEquals(ansHead, head);
    }
}