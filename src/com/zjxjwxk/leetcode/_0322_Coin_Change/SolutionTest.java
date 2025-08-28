package com.zjxjwxk.leetcode._0322_Coin_Change;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void coinChange() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int ans = 3;
        assertEquals(ans, solution.coinChange(coins, amount));
    }

    @Test
    void coinChange2() {
        int[] coins = {2};
        int amount = 3;
        int ans = -1;
        assertEquals(ans, solution.coinChange(coins, amount));
    }

    @Test
    void coinChange3() {
        int[] coins = {1};
        int amount = 0;
        int ans = 0;
        assertEquals(ans, solution.coinChange(coins, amount));
    }
}