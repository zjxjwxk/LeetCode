package com.zjxjwxk.leetcode._0725_Split_Linked_List_in_Parts;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void splitListToParts1() {
        ListNode head = DSFactory.newLinkedList(new int[]{
                1, 2, 3
        });
        int k = 5;
        ListNode[] ans = {
                DSFactory.newLinkedList(new int[]{1}),
                DSFactory.newLinkedList(new int[]{2}),
                DSFactory.newLinkedList(new int[]{3}),
                null,
                null
        };
        assertArrayEquals(ans, solution.splitListToParts(head, k));
    }

    @Test
    void splitListToParts2() {
        ListNode head = DSFactory.newLinkedList(new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        });
        int k = 3;
        ListNode[] ans = {
                DSFactory.newLinkedList(new int[]{1, 2, 3, 4}),
                DSFactory.newLinkedList(new int[]{5, 6 ,7}),
                DSFactory.newLinkedList(new int[]{8, 9, 10})
        };
        assertArrayEquals(ans, solution.splitListToParts(head, k));
    }
}