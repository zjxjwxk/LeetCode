package com.zjxjwxk.leetcode._0121_Best_Time_to_Buy_and_Sell_Stock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProfit1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = 5, result = solution.maxProfit(prices);
        assertEquals(ans, result);
    }

    @Test
    void maxProfit2() {
        int[] prices = {7, 6, 4, 3, 1};
        int ans = 0, result = solution.maxProfit(prices);
        assertEquals(ans, result);
    }
}