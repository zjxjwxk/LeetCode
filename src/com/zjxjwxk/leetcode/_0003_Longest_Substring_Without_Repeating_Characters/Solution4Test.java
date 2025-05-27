package com.zjxjwxk.leetcode._0003_Longest_Substring_Without_Repeating_Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution4Test {

    private final Solution4 solution4 = new Solution4();

    @Test
    void lengthOfLongestSubstring1() {
        String s = "abcabcbb";
        int ans = 3;
        assertEquals(ans, solution4.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring2() {
        String s = "bbbbb";
        int ans = 1;
        assertEquals(ans, solution4.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        int ans = 3;
        assertEquals(ans, solution4.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring4() {
        String s = "";
        int ans = 0;
        assertEquals(ans, solution4.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring5() {
        String s = "!@#$%^&*()_+ 123456789abcdefg";
        int ans = s.length();
        assertEquals(ans, solution4.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring6() {
        String s = "tmmzuxt";
        int ans = 5;
        assertEquals(ans, solution4.lengthOfLongestSubstring(s));
    }
}