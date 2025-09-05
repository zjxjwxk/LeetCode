package com.zjxjwxk.leetcode._0005_Longest_Palindromic_Substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution4Test {

    private final Solution4 solution4 = new Solution4();

    @Test
    void longestPalindrome1() {
        String s = "babad";
        String ans = "bab";
        assertEquals(ans, solution4.longestPalindrome(s));
    }

    @Test
    void longestPalindrome2() {
        String s = "cbbd";
        String ans = "bb";
        assertEquals(ans, solution4.longestPalindrome(s));
    }

    @Test
    void longestPalindrome3() {
        String s = "a";
        String ans = "a";
        assertEquals(ans, solution4.longestPalindrome(s));
    }

    @Test
    void longestPalindrome4() {
        String s = "ac";
        String ans = "a";
        assertEquals(ans, solution4.longestPalindrome(s));
    }
}