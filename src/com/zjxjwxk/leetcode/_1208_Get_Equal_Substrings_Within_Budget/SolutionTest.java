package com.zjxjwxk.leetcode._1208_Get_Equal_Substrings_Within_Budget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void equalSubstring1() {
        String s = "abcd";
        String t = "bcdf";
        int cost = 3;
        int ans = 3;
        assertEquals(ans, solution.equalSubstring(s, t, cost));
    }

    @Test
    void equalSubstring2() {
        String s = "abcd";
        String t = "cdef";
        int cost = 3;
        int ans = 1;
        assertEquals(ans, solution.equalSubstring(s, t, cost));
    }

    @Test
    void equalSubstring3() {
        String s = "abcd";
        String t = "acde";
        int cost = 0;
        int ans = 1;
        assertEquals(ans, solution.equalSubstring(s, t, cost));
    }
}