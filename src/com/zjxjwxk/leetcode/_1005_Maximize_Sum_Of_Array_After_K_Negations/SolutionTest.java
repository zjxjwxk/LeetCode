package com.zjxjwxk.leetcode._1005_Maximize_Sum_Of_Array_After_K_Negations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestSumAfterKNegations1() {
        int[] nums = {4, 2, 3};
        int k = 1;
        int ans = 5;
        assertEquals(ans, solution.largestSumAfterKNegations(nums, k));
    }

    @Test
    void largestSumAfterKNegations2() {
        int[] nums = {3, -1, 0, 2};
        int k = 3;
        int ans = 6;
        assertEquals(ans, solution.largestSumAfterKNegations(nums, k));
    }

    @Test
    void largestSumAfterKNegations3() {
        int[] nums = {2, -3, -1, 5, -4};
        int k = 2;
        int ans = 13;
        assertEquals(ans, solution.largestSumAfterKNegations(nums, k));
    }
}