package com.zjxjwxk.leetcode._0237_Delete_Node_in_a_Linked_List;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void deleteNode1() {
        ListNode node = DSFactory.newLinkedList(new int[]{4, 5, 1, 9});
        ListNode ans = DSFactory.newLinkedList(new int[]{4, 1, 9});
        solution.deleteNode(node.next);
        assertEquals(ans, node);
    }

    @Test
    void deleteNode2() {
        ListNode node = DSFactory.newLinkedList(new int[]{4, 5, 1, 9});
        ListNode ans = DSFactory.newLinkedList(new int[]{4, 5, 9});
        solution.deleteNode(node.next.next);
        assertEquals(ans, node);
    }

    @Test
    void deleteNode3() {
        ListNode node = DSFactory.newLinkedList(new int[]{1, 2, 3, 4});
        ListNode ans = DSFactory.newLinkedList(new int[]{1, 2, 4});
        solution.deleteNode(node.next.next);
        assertEquals(ans, node);
    }

    @Test
    void deleteNode4() {
        ListNode node = DSFactory.newLinkedList(new int[]{0, 1});
        ListNode ans = DSFactory.newLinkedList(new int[]{1});
        solution.deleteNode(node);
        assertEquals(ans, node);
    }

    @Test
    void deleteNode5() {
        ListNode node = DSFactory.newLinkedList(new int[]{-3, 5, -99});
        ListNode ans = DSFactory.newLinkedList(new int[]{5, -99});
        solution.deleteNode(node);
        assertEquals(ans, node);
    }
}