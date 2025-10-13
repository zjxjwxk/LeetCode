package com.zjxjwxk.leetcode._0125_Valid_Palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(solution.isPalindrome(s));
    }

    @Test
    void isPalindrome2() {
        String s = "race a car";
        assertFalse(solution.isPalindrome(s));
    }

    @Test
    void isPalindrome3() {
        String s = " ";
        assertTrue(solution.isPalindrome(s));
    }
}