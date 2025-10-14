package com.zjxjwxk.leetcode._0392_Is_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isSubsequence() {
        String s = "abc", t = "ahbgdc";
        assertTrue(solution.isSubsequence(s, t));
    }

    @Test
    void isSubsequence2() {
        String s = "axc", t = "ahbgdc";
        assertFalse(solution.isSubsequence(s, t));
    }
}