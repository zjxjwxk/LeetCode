package com.zjxjwxk.leetcode._0518_Coin_Change_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void change1() {
        int amount = 5;
        int[] coins = {1, 2, 5};
        int ans = 4;
        assertEquals(ans, solution.change(amount, coins));
    }

    @Test
    void change2() {
        int amount = 3;
        int[] coins = {2};
        int ans = 0;
        assertEquals(ans, solution.change(amount, coins));
    }

    @Test
    void change3() {
        int amount = 10;
        int[] coins = {10};
        int ans = 1;
        assertEquals(ans, solution.change(amount, coins));
    }
}