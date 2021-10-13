package com.zjxjwxk.leetcode._0050_Pow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void myPow1() {
        double x = 2;
        int n = 10;
        double ans = 1024;
        assertEquals(ans, solution.myPow(x, n));
    }

    @Test
    void myPow2() {
        double x = 2.1;
        int n = 3;
        double ans = 9.261000000000001;
        assertEquals(ans, solution.myPow(x, n));
    }

    @Test
    void myPow3() {
        double x = 2;
        int n = -2;
        double ans = 0.25;
        assertEquals(ans, solution.myPow(x, n));
    }

    @Test
    void myPow4() {
        double x = 1;
        int n = Integer.MIN_VALUE;
        double ans = 1;
        assertEquals(ans, solution.myPow(x, n));
    }
}