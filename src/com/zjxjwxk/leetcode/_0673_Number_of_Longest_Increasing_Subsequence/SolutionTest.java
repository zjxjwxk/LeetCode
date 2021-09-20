package com.zjxjwxk.leetcode._0673_Number_of_Longest_Increasing_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findNumberOfLIS1() {
        int[] nums = {1, 3, 5, 4, 7};
        int ans = 2;
        assertEquals(ans, solution.findNumberOfLIS(nums));
    }

    @Test
    void findNumberOfLIS2() {
        int[] nums = {2, 2, 2, 2, 2};
        int ans = 5;
        assertEquals(ans, solution.findNumberOfLIS(nums));
    }
}