package com.zjxjwxk.leetcode._0446_Arithmetic_Slices_II_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfArithmeticSlices1() {
        int[] nums = {2, 4, 6, 8, 10};
        int ans = 7;
        assertEquals(ans, solution.numberOfArithmeticSlices(nums));
    }

    @Test
    void numberOfArithmeticSlices2() {
        int[] nums = {7, 7, 7, 7, 7};
        int ans = 16;
        assertEquals(ans, solution.numberOfArithmeticSlices(nums));
    }
}