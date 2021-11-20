package com.zjxjwxk.leetcode._0594_Longest_Harmonious_Subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findLHS1() {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int ans = 5;
        assertEquals(ans, solution.findLHS(nums));
    }

    @Test
    void findLHS2() {
        int[] nums = {1, 2, 3, 4};
        int ans = 2;
        assertEquals(ans, solution.findLHS(nums));
    }

    @Test
    void findLHS3() {
        int[] nums = {1, 1, 1, 1};
        int ans = 0;
        assertEquals(ans, solution.findLHS(nums));
    }
}