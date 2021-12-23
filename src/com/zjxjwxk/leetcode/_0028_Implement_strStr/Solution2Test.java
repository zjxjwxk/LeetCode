package com.zjxjwxk.leetcode._0028_Implement_strStr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void strStr1() {
        String haystack = "hello", needle = "ll";
        int ans = 2;
        assertEquals(ans, solution2.strStr(haystack, needle));
    }

    @Test
    void strStr2() {
        String haystack = "aaaaa", needle = "bba";
        int ans = -1;
        assertEquals(ans, solution2.strStr(haystack, needle));
    }

    @Test
    void strStr3() {
        String haystack = "", needle = "";
        int ans = 0;
        assertEquals(ans, solution2.strStr(haystack, needle));
    }

    @Test
    void strStr4() {
        String haystack = "mississippi", needle = "mississippi";
        int ans = 0;
        assertEquals(ans, solution2.strStr(haystack, needle));
    }

    @Test
    void strStr5() {
        String haystack = "mississippi", needle = "issipi";
        int ans = -1;
        assertEquals(ans, solution2.strStr(haystack, needle));
    }
}