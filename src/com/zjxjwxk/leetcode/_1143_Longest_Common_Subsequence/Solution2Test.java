package com.zjxjwxk.leetcode._1143_Longest_Common_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void longestCommonSubsequence1() {
        String text1 = "abcde";
        String text2 = "ace";
        int ans = 3;
        assertEquals(ans, solution2.longestCommonSubsequence(text1, text2));
    }

    @Test
    void longestCommonSubsequence2() {
        String text1 = "abc";
        String text2 = "abc";
        int ans = 3;
        assertEquals(ans, solution2.longestCommonSubsequence(text1, text2));
    }

    @Test
    void longestCommonSubsequence3() {
        String text1 = "abc";
        String text2 = "def";
        int ans = 0;
        assertEquals(ans, solution2.longestCommonSubsequence(text1, text2));
    }
}