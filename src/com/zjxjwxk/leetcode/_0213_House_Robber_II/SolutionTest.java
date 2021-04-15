package com.zjxjwxk.leetcode._0213_House_Robber_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rob1() {
        int[] nums = {2, 3, 2};
        int ans = 3;
        assertEquals(ans, solution.rob(nums));
    }

    @Test
    void rob2() {
        int[] nums = {1, 2, 3, 1};
        int ans = 4;
        assertEquals(ans, solution.rob(nums));
    }

    @Test
    void rob3() {
        int[] nums = {0};
        int ans = 0;
        assertEquals(ans, solution.rob(nums));
    }
}