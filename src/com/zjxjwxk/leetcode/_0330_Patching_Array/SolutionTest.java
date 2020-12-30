package com.zjxjwxk.leetcode._0330_Patching_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minPatches1() {
        int[] nums = {1, 3};
        int n = 6;
        int ans = 1;
        assertEquals(ans, solution.minPatches(nums, n));
    }

    @Test
    void minPatches2() {
        int[] nums = {1, 5, 10};
        int n = 20;
        int ans = 2;
        assertEquals(ans, solution.minPatches(nums, n));
    }

    @Test
    void minPatches3() {
        int[] nums = {};
        int n = 7;
        int ans = 3;
        assertEquals(ans, solution.minPatches(nums, n));
    }

    @Test
    void minPatches4() {
        int[] nums = {1, 2, 31, 33};
        int n = 2147483647;
        int ans = 28;
        assertEquals(ans, solution.minPatches(nums, n));
    }
}