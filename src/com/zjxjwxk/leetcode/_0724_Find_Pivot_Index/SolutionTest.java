package com.zjxjwxk.leetcode._0724_Find_Pivot_Index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pivotIndex1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int ans = 3;
        assertEquals(ans, solution.pivotIndex(nums));
    }

    @Test
    void pivotIndex2() {
        int[] nums = {1, 2, 3};
        int ans = -1;
        assertEquals(ans, solution.pivotIndex(nums));
    }

    @Test
    void pivotIndex3() {
        int[] nums = {2, 1, -1};
        int ans = 0;
        assertEquals(ans, solution.pivotIndex(nums));
    }

    @Test
    void pivotIndex4() {
        int[] nums = {0, 0, 0, 0, 1};
        int ans = 4;
        assertEquals(ans, solution.pivotIndex(nums));
    }
}