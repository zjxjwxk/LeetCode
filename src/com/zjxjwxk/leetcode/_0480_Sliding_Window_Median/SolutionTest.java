package com.zjxjwxk.leetcode._0480_Sliding_Window_Median;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void medianSlidingWindow1() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        double[] ans = {1, -1, -1, 3, 5, 6};
        assertArrayEquals(ans, solution.medianSlidingWindow(nums, k));
    }

    @Test
    void medianSlidingWindow2() {
        int[] nums = {2147483647, 2147483647};
        int k = 2;
        double[] ans = {2147483647};
        assertArrayEquals(ans, solution.medianSlidingWindow(nums, k));
    }

    @Test
    void medianSlidingWindow3() {
        int[] nums = {-2147483648, -2147483648, 2147483647, -2147483648, -2147483648, -2147483648, 2147483647, 2147483647, 2147483647, 2147483647, -2147483648, 2147483647, -2147483648};
        int k = 3;
        double[] ans = {-2147483648.0, -2147483648.0, -2147483648.0, -2147483648.0, -2147483648.0, 2147483647.0, 2147483647.0, 2147483647.0, 2147483647.0, 2147483647.0, -2147483648.0};
        assertArrayEquals(ans, solution.medianSlidingWindow(nums, k));
    }
}