package com.zjxjwxk.leetcode._0377_Combination_Sum_IV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void combinationSum1() {
        int[] nums = {1, 2, 3};
        int target = 4;
        int ans = 7;
        assertEquals(ans, solution.combinationSum4(nums, target));
    }

    @Test
    void combinationSum2() {
        int[] nums = {9};
        int target = 3;
        int ans = 0;
        assertEquals(ans, solution.combinationSum4(nums, target));
    }
}