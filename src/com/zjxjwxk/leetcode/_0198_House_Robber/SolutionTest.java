package com.zjxjwxk.leetcode._0198_House_Robber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rob1() {
        int[] nums = {1, 2, 3, 1};
        int ans = 4;
        assertEquals(ans, solution.rob(nums));
    }

    @Test
    void rob2() {
        int[] nums = {2, 7, 9, 3, 1};
        int ans = 12;
        assertEquals(ans, solution.rob(nums));
    }
}