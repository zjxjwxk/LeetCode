package com.zjxjwxk.leetcode._0279_Perfect_Squares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numSquares1() {
        int n = 12;
        int ans = 3;
        assertEquals(ans, solution.numSquares(n));
    }

    @Test
    void numSquares2() {
        int n = 13;
        int ans = 2;
        assertEquals(ans, solution.numSquares(n));
    }
}