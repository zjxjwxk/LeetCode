package com.zjxjwxk.leetcode._0300_Longest_Increasing_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void lengthOfLIS1() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int ans = 4;
        assertEquals(ans, solution2.lengthOfLIS(nums));
    }

    @Test
    void lengthOfLIS2() {
        int[] nums = {0};
        int ans = 1;
        assertEquals(ans, solution2.lengthOfLIS(nums));
    }

    @Test
    void lengthOfLIS3() {
        int[] nums = {};
        int ans = 0;
        assertEquals(ans, solution2.lengthOfLIS(nums));
    }

    @Test
    void lengthOfLIS4() {
        int[] nums = {3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12};
        int ans = 6;
        assertEquals(ans, solution2.lengthOfLIS(nums));
    }
}