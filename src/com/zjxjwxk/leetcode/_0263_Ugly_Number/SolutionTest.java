package com.zjxjwxk.leetcode._0263_Ugly_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isUgly1() {
        int n = 6;
        assertTrue(solution.isUgly(n));
    }

    @Test
    void isUgly2() {
        int n = 8;
        assertTrue(solution.isUgly(n));
    }

    @Test
    void isUgly3() {
        int n = 14;
        assertFalse(solution.isUgly(n));
    }

    @Test
    void isUgly4() {
        int n = 1;
        assertTrue(solution.isUgly(n));
    }

    @Test
    void isUgly5() {
        int n = -2147483648;
        assertFalse(solution.isUgly(n));
    }

    @Test
    void isUgly6() {
        int n = -1000;
        assertFalse(solution.isUgly(n));
    }
}