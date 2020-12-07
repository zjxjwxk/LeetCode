package com.zjxjwxk.leetcode._0659_Split_Array_into_Consecutive_Subsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isPossible1() {
        int[] nums = {1, 2, 3, 3, 4, 5};
        assertTrue(solution.isPossible(nums));
    }

    @Test
    void isPossible2() {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 5};
        assertTrue(solution.isPossible(nums));
    }

    @Test
    void isPossible3() {
        int[] nums = {1, 2, 3, 4, 4, 5};
        assertFalse(solution.isPossible(nums));
    }
}