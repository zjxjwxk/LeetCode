package com.zjxjwxk.leetcode._0132_Palindrome_Partitioning_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minCut1() {
        String s = "aab";
        int ans = 1;
        assertEquals(ans, solution.minCut(s));
    }

    @Test
    void minCut2() {
        String s = "a";
        int ans = 0;
        assertEquals(ans, solution.minCut(s));
    }

    @Test
    void minCut3() {
        String s = "ab";
        int ans = 1;
        assertEquals(ans, solution.minCut(s));
    }
}