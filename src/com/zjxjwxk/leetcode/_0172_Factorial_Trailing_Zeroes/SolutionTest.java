package com.zjxjwxk.leetcode._0172_Factorial_Trailing_Zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void trailingZeroes() {
        int n = 3;
        int ans = 0;
        assertEquals(ans, solution.trailingZeroes(n));
    }

    @Test
    void trailingZeroes2() {
        int n = 5;
        int ans = 1;
        assertEquals(ans, solution.trailingZeroes(n));
    }

    @Test
    void trailingZeroes3() {
        int n = 0;
        int ans = 0;
        assertEquals(ans, solution.trailingZeroes(n));
    }
}