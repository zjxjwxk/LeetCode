package com.zjxjwxk.leetcode._0160_Intersection_of_Two_Linked_Lists;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getIntersectionNode1() {
        ListNode headA = DSFactory.newLinkedList(new int[]{
                4
        });
        ListNode headB = DSFactory.newLinkedList(new int[]{
                5, 0
        });
        ListNode ans = DSFactory.newLinkedList(new int[]{
                1, 8, 4, 5
        });
        headA.next = ans;
        headB.next = ans;
        assertEquals(ans, solution.getIntersectionNode(headA, headB));
    }

    @Test
    void getIntersectionNode2() {
        ListNode headA = DSFactory.newLinkedList(new int[]{
                0, 9, 1
        });
        ListNode headB = DSFactory.newLinkedList(new int[]{
                3
        });
        ListNode ans = DSFactory.newLinkedList(new int[]{
                2, 4
        });
        headA.next = ans;
        headB.next = ans;
        assertEquals(ans, solution.getIntersectionNode(headA, headB));
    }

    @Test
    void getIntersectionNode3() {
        ListNode headA = DSFactory.newLinkedList(new int[]{
                2, 6, 4
        });
        ListNode headB = DSFactory.newLinkedList(new int[]{
                1, 5
        });
        assertNull(solution.getIntersectionNode(headA, headB));
    }

    @Test
    void getIntersectionNode4() {
        ListNode headA;
        ListNode headB;
        ListNode ans = DSFactory.newLinkedList(new int[]{
                1
        });
        headA = ans;
        headB = ans;
        assertEquals(ans, solution.getIntersectionNode(headA, headB));
    }

    @Test
    void getIntersectionNode5() {
        ListNode headA;
        ListNode headB = DSFactory.newLinkedList(new int[]{
                2
        });
        ListNode ans = DSFactory.newLinkedList(new int[]{
                3
        });
        headA = ans;
        headB.next = ans;
        assertEquals(ans, solution.getIntersectionNode(headA, headB));
    }
}