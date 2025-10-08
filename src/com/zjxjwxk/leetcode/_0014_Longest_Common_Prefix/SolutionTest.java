package com.zjxjwxk.leetcode._0014_Longest_Common_Prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight"};
        String ans = "fl";
        assertEquals(ans, solution.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix2() {
        String[] strs = {"dog", "racecar", "car"};
        String ans = "";
        assertEquals(ans, solution.longestCommonPrefix(strs));
    }
}