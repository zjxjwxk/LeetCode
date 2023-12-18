package com.zjxjwxk.leetcode._0025_Reverse_Nodes_in_k_Group;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void reverseKGroup() {
        ListNode head = DSFactory.newListNode(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        ListNode ans = DSFactory.newListNode(new int[]{2, 1, 4, 3, 5});
        assertEquals(ans, solution2.reverseKGroup(head, k));
    }

    @Test
    void reverseKGroup2() {
        ListNode head = DSFactory.newListNode(new int[]{1, 2, 3, 4, 5});
        int k = 3;
        ListNode ans = DSFactory.newListNode(new int[]{3, 2, 1, 4, 5});
        assertEquals(ans, solution2.reverseKGroup(head, k));
    }

    @Test
    void reverseKGroup3() {
        ListNode head = DSFactory.newListNode(new int[]{1, 2, 3, 4, 5});
        int k = 1;
        ListNode ans = DSFactory.newListNode(new int[]{1, 2, 3, 4, 5});
        assertEquals(ans, solution2.reverseKGroup(head, k));
    }

    @Test
    void reverseKGroup4() {
        ListNode head = DSFactory.newListNode(new int[]{1});
        int k = 1;
        ListNode ans = DSFactory.newListNode(new int[]{1});
        assertEquals(ans, solution2.reverseKGroup(head, k));
    }
}