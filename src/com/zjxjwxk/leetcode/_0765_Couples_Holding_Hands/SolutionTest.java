package com.zjxjwxk.leetcode._0765_Couples_Holding_Hands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minSwapsCouples1() {
        int[] row = {0, 2, 1, 3};
        int ans = 1;
        assertEquals(ans, solution.minSwapsCouples(row));
    }

    @Test
    void minSwapsCouples2() {
        int[] row = {3, 2, 0, 1};
        int ans = 0;
        assertEquals(ans, solution.minSwapsCouples(row));
    }
}