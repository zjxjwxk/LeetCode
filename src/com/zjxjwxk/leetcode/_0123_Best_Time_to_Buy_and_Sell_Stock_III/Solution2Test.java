package com.zjxjwxk.leetcode._0123_Best_Time_to_Buy_and_Sell_Stock_III;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void maxProfit1() {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int ans = 6;
        assertEquals(ans, solution2.maxProfit(prices));
    }

    @Test
    void maxProfit2() {
        int[] prices = {1, 2, 3, 4, 5};
        int ans = 4;
        assertEquals(ans, solution2.maxProfit(prices));
    }

    @Test
    void maxProfit3() {
        int[] prices = {7, 6, 4, 3, 1};
        int ans = 0;
        assertEquals(ans, solution2.maxProfit(prices));
    }
}