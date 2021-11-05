package com.zjxjwxk.leetcode._1218_Longest_Arithmetic_Subsequence_of_Given_Difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestSubsequence1() {
        int[] arr = {1, 2, 3, 4};
        int difference = 1;
        int ans = 4;
        assertEquals(ans, solution.longestSubsequence(arr, difference));
    }

    @Test
    void longestSubsequence2() {
        int[] arr = {1, 3, 5, 7};
        int difference = 1;
        int ans = 1;
        assertEquals(ans, solution.longestSubsequence(arr, difference));
    }

    @Test
    void longestSubsequence3() {
        int[] arr = {1, 5, 7, 8, 5, 3, 4, 2, 1};
        int difference = -2;
        int ans = 4;
        assertEquals(ans, solution.longestSubsequence(arr, difference));
    }
}