package com.zjxjwxk.leetcode._0086_Partition_List;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void partition() {
        ListNode head = DSFactory.newLinkedList(new int[]{1, 4, 3, 2, 5, 2});
        int x = 3;
        ListNode ans = DSFactory.newLinkedList(new int[]{1, 2, 2, 4, 3, 5});
        assertEquals(ans, solution.partition(head, x));
    }
}