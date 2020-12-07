package com.zjxjwxk.leetcode._0659_Split_Array_into_Consecutive_Subsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void isPossible1() {
        int[] nums = {1, 2, 3, 3, 4, 5};
        assertTrue(solution2.isPossible(nums));
    }

    @Test
    void isPossible2() {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 5};
        assertTrue(solution2.isPossible(nums));
    }

    @Test
    void isPossible3() {
        int[] nums = {1, 2, 3, 4, 4, 5};
        assertFalse(solution2.isPossible(nums));
    }
}