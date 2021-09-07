package com.zjxjwxk.leetcode._0516_Longest_Palindromic_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestPalindromeSubseq1() {
        String s = "bbbab";
        int ans = 4;
        assertEquals(ans, solution.longestPalindromeSubseq(s));
    }

    @Test
    void longestPalindromeSubseq2() {
        String s = "cbbd";
        int ans = 2;
        assertEquals(ans, solution.longestPalindromeSubseq(s));
    }
}