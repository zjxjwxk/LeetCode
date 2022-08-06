package com.zjxjwxk.leetcode._1911_Maximum_Alternating_Subsequence_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxAlternatingSum1() {
        int[] nums = {4, 2, 5, 3};
        int ans = 7;
        assertEquals(ans, solution.maxAlternatingSum(nums));
    }

    @Test
    void maxAlternatingSum2() {
        int[] nums = {5, 6, 7, 8};
        int ans = 8;
        assertEquals(ans, solution.maxAlternatingSum(nums));
    }

    @Test
    void maxAlternatingSum3() {
        int[] nums = {6, 2, 1, 2, 4, 5};
        int ans = 10;
        assertEquals(ans, solution.maxAlternatingSum(nums));
    }
}