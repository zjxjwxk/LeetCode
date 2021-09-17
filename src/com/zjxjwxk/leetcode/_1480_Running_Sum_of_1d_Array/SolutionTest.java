package com.zjxjwxk.leetcode._1480_Running_Sum_of_1d_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void runningSum1() {
        int[] nums = {1, 2, 3, 4};
        int[] ans = {1, 3, 6, 10};
        assertArrayEquals(ans, solution.runningSum(nums));
    }

    @Test
    void runningSum2() {
        int[] nums = {1, 1, 1, 1, 1};
        int[] ans = {1, 2, 3, 4, 5};
        assertArrayEquals(ans, solution.runningSum(nums));
    }

    @Test
    void runningSum3() {
        int[] nums = {3, 1, 2, 10, 1};
        int[] ans = {3, 4, 6, 16, 17};
        assertArrayEquals(ans, solution.runningSum(nums));
    }
}