package com.zjxjwxk.leetcode._0502_IPO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMaximizedCapital1() {
        int k = 2, w = 0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 1};
        int ans = 4;
        assertEquals(ans, solution.findMaximizedCapital(k, w, profits, capital));
    }

    @Test
    void findMaximizedCapital2() {
        int k = 3, w = 0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 2};
        int ans = 6;
        assertEquals(ans, solution.findMaximizedCapital(k, w, profits, capital));
    }

    @Test
    void findMaximizedCapital3() {
        int k = 1, w = 2;
        int[] profits = {1, 2, 3};
        int[] capital = {1, 1, 2};
        int ans = 5;
        assertEquals(ans, solution.findMaximizedCapital(k, w, profits, capital));
    }
}