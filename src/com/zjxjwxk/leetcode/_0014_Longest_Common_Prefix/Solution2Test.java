package com.zjxjwxk.leetcode._0014_Longest_Common_Prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void longestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight"};
        String ans = "fl";
        assertEquals(ans, solution2.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix2() {
        String[] strs = {"dog", "racecar", "car"};
        String ans = "";
        assertEquals(ans, solution2.longestCommonPrefix(strs));
    }
}