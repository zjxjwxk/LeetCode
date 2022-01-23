package com.zjxjwxk.leetcode._0560_Subarray_Sum_Equals_K;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void subarraySum1() {
        int[] nums = {1, 1, 1};
        int k = 2;
        int ans = 2;
        assertEquals(ans, solution2.subarraySum(nums, k));
    }

    @Test
    void subarraySum2() {
        int[] nums = {1, 2, 3};
        int k = 3;
        int ans = 2;
        assertEquals(ans, solution2.subarraySum(nums, k));
    }
}