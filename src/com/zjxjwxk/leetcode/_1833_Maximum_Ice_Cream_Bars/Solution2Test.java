package com.zjxjwxk.leetcode._1833_Maximum_Ice_Cream_Bars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void maxIceCream1() {
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;
        int ans = 4;
        assertEquals(ans, solution2.maxIceCream(costs, coins));
    }

    @Test
    void maxIceCream2() {
        int[] costs = {10, 6, 8, 7, 7, 8};
        int coins = 5;
        int ans = 0;
        assertEquals(ans, solution2.maxIceCream(costs, coins));
    }

    @Test
    void maxIceCream3() {
        int[] costs = {1, 6, 3, 1, 2, 5};
        int coins = 20;
        int ans = 6;
        assertEquals(ans, solution2.maxIceCream(costs, coins));
    }
}