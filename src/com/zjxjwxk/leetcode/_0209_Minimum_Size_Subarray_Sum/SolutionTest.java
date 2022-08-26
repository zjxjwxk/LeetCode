package com.zjxjwxk.leetcode._0209_Minimum_Size_Subarray_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minSubArrayLen1() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int ans = 2;
        assertEquals(ans, solution.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLen2() {
        int[] nums = {1, 4, 4};
        int target = 4;
        int ans = 1;
        assertEquals(ans, solution.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLen3() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        int ans = 0;
        assertEquals(ans, solution.minSubArrayLen(target, nums));
    }
}