package com.zjxjwxk.leetcode._0525_Contiguous_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMaxLength1() {
        int[] nums = {0, 1};
        int ans = 2;
        assertEquals(ans, solution.findMaxLength(nums));
    }

    @Test
    void findMaxLength2() {
        int[] nums = {0, 1, 0};
        int ans = 2;
        assertEquals(ans, solution.findMaxLength(nums));
    }
}