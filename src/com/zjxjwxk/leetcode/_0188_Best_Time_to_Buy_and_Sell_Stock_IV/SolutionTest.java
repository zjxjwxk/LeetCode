package com.zjxjwxk.leetcode._0188_Best_Time_to_Buy_and_Sell_Stock_IV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProfit1() {
        int k = 2;
        int[] prices = {2, 4, 1};
        int ans = 2;
        assertEquals(ans, solution.maxProfit(k, prices));
    }

    @Test
    void maxProfit2() {
        int k = 2;
        int[] prices = {3, 2, 6, 5, 0, 3};
        int ans = 7;
        assertEquals(ans, solution.maxProfit(k, prices));
    }

    @Test
    void maxProfit3() {
        int k = 2;
        int[] prices = {};
        int ans = 0;
        assertEquals(ans, solution.maxProfit(k, prices));
    }

    @Test
    void maxProfit4() {
        int k = 2;
        int[] prices = {1, 0};
        int ans = 0;
        assertEquals(ans, solution.maxProfit(k, prices));
    }
}