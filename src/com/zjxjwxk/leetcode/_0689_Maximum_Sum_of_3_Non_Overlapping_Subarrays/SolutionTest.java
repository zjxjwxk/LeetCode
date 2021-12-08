package com.zjxjwxk.leetcode._0689_Maximum_Sum_of_3_Non_Overlapping_Subarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSumOfThreeSubarrays1() {
        int[] nums = {1, 2, 1, 2, 6, 7, 5, 1};
        int k = 2;
        int[] ans = {0, 3, 5};
        assertArrayEquals(ans, solution.maxSumOfThreeSubarrays(nums, k));
    }

    @Test
    void maxSumOfThreeSubarrays2() {
        int[] nums = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        int k = 2;
        int[] ans = {0, 2, 4};
        assertArrayEquals(ans, solution.maxSumOfThreeSubarrays(nums, k));
    }

    @Test
    void maxSumOfThreeSubarrays3() {
        int[] nums = {7, 13, 20, 19, 19, 2, 10, 1, 1, 19};
        int k = 3;
        int[] ans = {1, 4, 7};
        assertArrayEquals(ans, solution.maxSumOfThreeSubarrays(nums, k));
    }
}