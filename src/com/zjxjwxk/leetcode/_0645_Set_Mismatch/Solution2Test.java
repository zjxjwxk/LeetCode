package com.zjxjwxk.leetcode._0645_Set_Mismatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void findErrorNums1() {
        int[] nums = {1, 2, 2, 4};
        int[] ans = {2, 3};
        assertArrayEquals(ans, solution2.findErrorNums(nums));
    }

    @Test
    void findErrorNums2() {
        int[] nums = {1, 1};
        int[] ans = {1, 2};
        assertArrayEquals(ans, solution2.findErrorNums(nums));
    }
}