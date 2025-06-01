package com.zjxjwxk.leetcode._0076_Minimum_Window_Substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minWindow() {
        String s = "ADOBECODEBANC", t = "ABC";
        String ans = "BANC";
        assertEquals(ans, solution.minWindow(s, t));
    }

    @Test
    void minWindow2() {
        String s = "a", t = "a";
        String ans = "a";
        assertEquals(ans, solution.minWindow(s, t));
    }

    @Test
    void minWindow3() {
        String s = "a", t = "aa";
        String ans = "";
        assertEquals(ans, solution.minWindow(s, t));
    }
}