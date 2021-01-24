package com.zjxjwxk.leetcode._0674_Longest_Continuous_Increasing_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findLengthOfLCIS1() {
        int[] nums = {1, 3, 5, 4, 7};
        int ans = 3;
        assertEquals(ans, solution.findLengthOfLCIS(nums));
    }

    @Test
    void findLengthOfLCIS2() {
        int[] nums = {2, 2, 2, 2, 2};
        int ans = 1;
        assertEquals(ans, solution.findLengthOfLCIS(nums));
    }

    @Test
    void findLengthOfLCIS3() {
        int[] nums = {1, 3, 5, 7};
        int ans = 4;
        assertEquals(ans, solution.findLengthOfLCIS(nums));
    }
}