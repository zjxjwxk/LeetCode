package com.zjxjwxk.leetcode._0714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProfit1() {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int ans = 8;
        assertEquals(ans, solution.maxProfit(prices, fee));
    }

    @Test
    void maxProfit2() {
        int[] prices = {1, 3, 7, 5, 10, 3};
        int fee = 3;
        int ans = 6;
        assertEquals(ans, solution.maxProfit(prices, fee));
    }
}