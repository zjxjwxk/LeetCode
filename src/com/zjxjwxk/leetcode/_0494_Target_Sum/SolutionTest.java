package com.zjxjwxk.leetcode._0494_Target_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findTargetSumWays1() {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        int ans = 5;
        assertEquals(ans, solution.findTargetSumWays(nums, target));
    }

    @Test
    void findTargetSumWays2() {
        int[] nums = {1};
        int target = 1;
        int ans = 1;
        assertEquals(ans, solution.findTargetSumWays(nums, target));
    }
}