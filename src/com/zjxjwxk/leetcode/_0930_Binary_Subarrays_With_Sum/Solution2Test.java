package com.zjxjwxk.leetcode._0930_Binary_Subarrays_With_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void numSubarraysWithSum1() {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        int ans = 4;
        assertEquals(ans, solution2.numSubarraysWithSum(nums, goal));
    }

    @Test
    void numSubarraysWithSum2() {
        int[] nums = {0, 0, 0, 0, 0};
        int goal = 0;
        int ans = 15;
        assertEquals(ans, solution2.numSubarraysWithSum(nums, goal));
    }
}