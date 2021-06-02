package com.zjxjwxk.leetcode._0523_Continuous_Subarray_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkSubarraySum1() {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        assertTrue(solution.checkSubarraySum(nums, k));
    }

    @Test
    void checkSubarraySum2() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 6;
        assertTrue(solution.checkSubarraySum(nums, k));
    }

    @Test
    void checkSubarraySum3() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 13;
        assertFalse(solution.checkSubarraySum(nums, k));
    }

    @Test
    void checkSubarraySum4() {
        int[] nums = {0, 0};
        int k = 1;
        assertTrue(solution.checkSubarraySum(nums, k));
    }
}