package com.zjxjwxk.leetcode._0234_Palindrome_Linked_List;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void isPalindrome() {
        ListNode head = DSFactory.newListNode(new int[]{1, 2, 2, 1});
        assertTrue(solution2.isPalindrome(head));
    }

    @Test
    void isPalindrome2() {
        ListNode head = DSFactory.newListNode(new int[]{1, 1, 2, 1});
        assertFalse(solution2.isPalindrome(head));
    }
}