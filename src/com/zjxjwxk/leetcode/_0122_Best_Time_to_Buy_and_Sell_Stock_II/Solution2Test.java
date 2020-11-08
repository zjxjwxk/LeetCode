package com.zjxjwxk.leetcode._0122_Best_Time_to_Buy_and_Sell_Stock_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void maxProfit1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = 7, result = solution2.maxProfit(prices);
        assertEquals(ans, result);
    }

    @Test
    void maxProfit2() {
        int[] prices = {1, 2, 3, 4, 5};
        int ans = 4, result = solution2.maxProfit(prices);
        assertEquals(ans, result);
    }

    @Test
    void maxProfit3() {
        int[] prices = {7, 6, 4, 3, 1};
        int ans = 0, result = solution2.maxProfit(prices);
        assertEquals(ans, result);
    }
}