package com.zjxjwxk.leetcode._0029_Divide_Two_Integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void divide1() {
        int dividend = 10, divisor = 3;
        int ans = 3;
        assertEquals(ans, solution.divide(dividend, divisor));
    }

    @Test
    void divide2() {
        int dividend = 7, divisor = -3;
        int ans = -2;
        assertEquals(ans, solution.divide(dividend, divisor));
    }

    @Test
    void divide3() {
        int dividend = 1, divisor = 1;
        int ans = 1;
        assertEquals(ans, solution.divide(dividend, divisor));
    }

    @Test
    void divide4() {
        int dividend = Integer.MIN_VALUE, divisor = -1;
        int ans = Integer.MAX_VALUE;
        assertEquals(ans, solution.divide(dividend, divisor));
    }

    @Test
    void divide5() {
        int dividend = Integer.MIN_VALUE, divisor = -3;
        int ans = 715827882;
        assertEquals(ans, solution.divide(dividend, divisor));
    }

    @Test
    void divide6() {
        int dividend = 1038925803, divisor = Integer.MIN_VALUE;
        int ans = 0;
        assertEquals(ans, solution.divide(dividend, divisor));
    }
}