package com.zjxjwxk.leetcode._0879_Profitable_Schemes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void profitableSchemes1() {
        int n = 5, minProfit = 3;
        int[] group = {2, 2};
        int[] profit = {2, 3};
        int ans = 2;
        assertEquals(ans, solution.profitableSchemes(n, minProfit, group, profit));
    }

    @Test
    void profitableSchemes2() {
        int n = 10, minProfit = 5;
        int[] group = {2, 3, 5};
        int[] profit = {6, 7, 8};
        int ans = 7;
        assertEquals(ans, solution.profitableSchemes(n, minProfit, group, profit));
    }
}