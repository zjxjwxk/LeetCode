package com.zjxjwxk.leetcode._0061_Rotate_List;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void rotateRight1() {
        ListNode head = DSFactory.newLinkedList(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        ListNode ans = DSFactory.newLinkedList(new int[]{4, 5, 1, 2, 3});
        assertEquals(ans, solution2.rotateRight(head, k));
    }

    @Test
    void rotateRight2() {
        ListNode head = DSFactory.newLinkedList(new int[]{0, 1, 2});
        int k = 4;
        ListNode ans = DSFactory.newLinkedList(new int[]{2, 0, 1});
        assertEquals(ans, solution2.rotateRight(head, k));
    }

    @Test
    void rotateRight3() {
        ListNode head = DSFactory.newLinkedList(new int[]{});
        int k = 4;
        ListNode ans = DSFactory.newLinkedList(new int[]{});
        assertEquals(ans, solution2.rotateRight(head, k));
    }

    @Test
    void rotateRight5() {
        ListNode head = DSFactory.newLinkedList(new int[]{1});
        int k = 0;
        ListNode ans = DSFactory.newLinkedList(new int[]{1});
        assertEquals(ans, solution2.rotateRight(head, k));
    }

    @Test
    void rotateRight6() {
        ListNode head = DSFactory.newLinkedList(new int[]{1});
        int k = 1;
        ListNode ans = DSFactory.newLinkedList(new int[]{1});
        assertEquals(ans, solution2.rotateRight(head, k));
    }

    @Test
    void rotateRight7() {
        ListNode head = DSFactory.newLinkedList(new int[]{1});
        int k = 99;
        ListNode ans = DSFactory.newLinkedList(new int[]{1});
        assertEquals(ans, solution2.rotateRight(head, k));
    }

    @Test
    void rotateRight8() {
        ListNode head = DSFactory.newLinkedList(new int[]{1, 2});
        int k = 1;
        ListNode ans = DSFactory.newLinkedList(new int[]{2, 1});
        assertEquals(ans, solution2.rotateRight(head, k));
    }

    @Test
    void rotateRight9() {
        ListNode head = DSFactory.newLinkedList(new int[]{1, 2});
        int k = 2;
        ListNode ans = DSFactory.newLinkedList(new int[]{1, 2});
        assertEquals(ans, solution2.rotateRight(head, k));
    }
}