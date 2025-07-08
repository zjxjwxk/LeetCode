package com.zjxjwxk.leetcode._0023.Merge_k_Sorted_Lists;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void mergeKLists1() {
        ListNode[] lists = new ListNode[]{
                DSFactory.newListNode(new int[]{1, 4, 5}),
                DSFactory.newListNode(new int[]{1, 3, 4}),
                DSFactory.newListNode(new int[]{2, 6})
        };
        ListNode ans = DSFactory.newListNode(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertEquals(ans, solution3.mergeKLists(lists));
    }

    @Test
    void mergeKLists2() {
        ListNode[] lists = new ListNode[]{};
        ListNode ans = DSFactory.newListNode(new int[]{});
        assertEquals(ans, solution3.mergeKLists(lists));
    }

    @Test
    void mergeKLists3() {
        ListNode[] lists = new ListNode[]{
                DSFactory.newListNode(new int[]{})
        };
        ListNode ans = DSFactory.newListNode(new int[]{});
        assertEquals(ans, solution3.mergeKLists(lists));
    }
}