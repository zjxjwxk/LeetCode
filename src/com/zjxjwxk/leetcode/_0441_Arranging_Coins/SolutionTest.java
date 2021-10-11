package com.zjxjwxk.leetcode._0441_Arranging_Coins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void arrangeCoins1() {
        int n = 5;
        int ans = 2;
        assertEquals(ans, solution.arrangeCoins(n));
    }

    @Test
    void arrangeCoins2() {
        int n = 8;
        int ans = 3;
        assertEquals(ans, solution.arrangeCoins(n));
    }

    @Test
    void arrangeCoins3() {
        int n = 1804289383;
        int ans = 60070;
        assertEquals(ans, solution.arrangeCoins(n));
    }
}