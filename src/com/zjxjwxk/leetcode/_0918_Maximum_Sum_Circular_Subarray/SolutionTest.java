package com.zjxjwxk.leetcode._0918_Maximum_Sum_Circular_Subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSubarraySumCircular() {
        int[] nums = {1, -2, 3, -2};
        int ans = 3;
        assertEquals(ans, solution.maxSubarraySumCircular(nums));
    }

    @Test
    void maxSubarraySumCircular2() {
        int[] nums = {5, -3, 5};
        int ans = 10;
        assertEquals(ans, solution.maxSubarraySumCircular(nums));
    }

    @Test
    void maxSubarraySumCircular3() {
        int[] nums = {3, -2, 2, -3};
        int ans = 3;
        assertEquals(ans, solution.maxSubarraySumCircular(nums));
    }
}