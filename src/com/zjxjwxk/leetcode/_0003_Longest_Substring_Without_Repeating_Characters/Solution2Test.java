package com.zjxjwxk.leetcode._0003_Longest_Substring_Without_Repeating_Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void lengthOfLongestSubstring1() {
        String s = "abcabcbb";
        int ans = 3;
        assertEquals(ans, solution2.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring2() {
        String s = "bbbbb";
        int ans = 1;
        assertEquals(ans, solution2.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        int ans = 3;
        assertEquals(ans, solution2.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring4() {
        String s = "";
        int ans = 0;
        assertEquals(ans, solution2.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring5() {
        String s = "!@#$%^&*()_+ 123456789abcdefg";
        int ans = s.length();
        assertEquals(ans, solution2.lengthOfLongestSubstring(s));
    }
}