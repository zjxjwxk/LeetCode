package com.zjxjwxk.leetcode._0342_Power_of_Four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isPowerOfFour1() {
        int n = 16;
        assertTrue(solution.isPowerOfFour(n));
    }

    @Test
    void isPowerOfFour2() {
        int n = 5;
        assertFalse(solution.isPowerOfFour(n));
    }

    @Test
    void isPowerOfFour3() {
        int n = 1;
        assertTrue(solution.isPowerOfFour(n));
    }
}