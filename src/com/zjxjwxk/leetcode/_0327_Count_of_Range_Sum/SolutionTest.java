package com.zjxjwxk.leetcode._0327_Count_of_Range_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countRangeSum1() {
        int[] nums = {-2, 5, -1};
        int lower = -2, upper = 2;
        assertEquals(3, solution.countRangeSum(nums, lower, upper));
    }

    @Test
    void countRangeSum2() {
        int[] nums = {-2147483647, 0, -2147483647, 2147483647};
        int lower = -564, upper = 3864;
        assertEquals(3, solution.countRangeSum(nums, lower, upper));
    }
}