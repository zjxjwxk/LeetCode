package com.zjxjwxk.leetcode._0264_Ugly_Number_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nthUglyNumber1() {
        int n = 10;
        int ans = 12;
        assertEquals(ans, solution.nthUglyNumber(n));
    }

    @Test
    void nthUglyNumber2() {
        int n = 1;
        int ans = 1;
        assertEquals(ans, solution.nthUglyNumber(n));
    }
}