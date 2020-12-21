package com.zjxjwxk.leetcode._0746_Min_Cost_Climbing_Stairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minCostClimbingStairs1() {
        int[] cost = {10, 15, 20};
        int ans = 15;
        assertEquals(ans, solution.minCostClimbingStairs(cost));
    }

    @Test
    void minCostClimbingStairs2() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int ans = 6;
        assertEquals(ans, solution.minCostClimbingStairs(cost));
    }
}