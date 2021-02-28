package com.zjxjwxk.leetcode._0395_Longest_Substring_with_At_Least_K_Repeating_Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestSubstring1() {
        String s = "aaabb";
        int k = 3;
        int ans = 3;
        assertEquals(ans, solution.longestSubstring(s, k));
    }

    @Test
    void longestSubstring2() {
        String s = "ababbc";
        int k = 2;
        int ans = 5;
        assertEquals(ans, solution.longestSubstring(s, k));
    }
}