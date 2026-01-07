package com.zjxjwxk.leetcode._0076_Minimum_Window_Substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void minWindow() {
        String s = "ADOBECODEBANC", t = "ABC";
        String ans = "BANC";
        assertEquals(ans, solution3.minWindow(s, t));
    }

    @Test
    void minWindow2() {
        String s = "a", t = "a";
        String ans = "a";
        assertEquals(ans, solution3.minWindow(s, t));
    }

    @Test
    void minWindow3() {
        String s = "a", t = "aa";
        String ans = "";
        assertEquals(ans, solution3.minWindow(s, t));
    }
}