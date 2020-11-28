package com.zjxjwxk.leetcode._0300_Longest_Increasing_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lengthOfLIS1() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int ans = 4;
        assertEquals(ans, solution.lengthOfLIS(nums));
    }

    @Test
    void lengthOfLIS2() {
        int[] nums = {0};
        int ans = 1;
        assertEquals(ans, solution.lengthOfLIS(nums));
    }

    @Test
    void lengthOfLIS3() {
        int[] nums = {};
        int ans = 0;
        assertEquals(ans, solution.lengthOfLIS(nums));
    }
}