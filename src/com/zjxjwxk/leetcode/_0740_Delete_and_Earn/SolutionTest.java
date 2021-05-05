package com.zjxjwxk.leetcode._0740_Delete_and_Earn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();
    
    @Test
    void deleteAndEarn1() {
        int[] nums = {3, 4, 2};
        int ans = 6;
        assertEquals(ans, solution.deleteAndEarn(nums));
    }

    @Test
    void deleteAndEarn2() {
        int[] nums = {2, 2, 3, 3, 3, 4};
        int ans = 9;
        assertEquals(ans, solution.deleteAndEarn(nums));
    }

    @Test
    void deleteAndEarn3() {
        int[] nums = {3, 1};
        int ans = 4;
        assertEquals(ans, solution.deleteAndEarn(nums));
    }
}