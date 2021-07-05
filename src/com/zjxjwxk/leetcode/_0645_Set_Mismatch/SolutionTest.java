package com.zjxjwxk.leetcode._0645_Set_Mismatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findErrorNums1() {
        int[] nums = {1, 2, 2, 4};
        int[] ans = {2, 3};
        assertArrayEquals(ans, solution.findErrorNums(nums));
    }

    @Test
    void findErrorNums2() {
        int[] nums = {1, 1};
        int[] ans = {1, 2};
        assertArrayEquals(ans, solution.findErrorNums(nums));
    }
}