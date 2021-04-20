package com.zjxjwxk.leetcode._0028_Implement_strStr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void strStr1() {
        String haystack = "hello", needle = "ll";
        int ans = 2;
        assertEquals(ans, solution.strStr(haystack, needle));
    }

    @Test
    void strStr2() {
        String haystack = "aaaaa", needle = "bba";
        int ans = -1;
        assertEquals(ans, solution.strStr(haystack, needle));
    }

    @Test
    void strStr3() {
        String haystack = "", needle = "";
        int ans = 0;
        assertEquals(ans, solution.strStr(haystack, needle));
    }
}