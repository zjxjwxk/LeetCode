package com.zjxjwxk.leetcode._0326_Power_of_Three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isPowerOfThree1() {
        int n = 27;
        assertTrue(solution.isPowerOfThree(n));
    }

    @Test
    void isPowerOfThree2() {
        int n = 0;
        assertFalse(solution.isPowerOfThree(n));
    }

    @Test
    void isPowerOfThree3() {
        int n = 9;
        assertTrue(solution.isPowerOfThree(n));
    }

    @Test
    void isPowerOfThree4() {
        int n = 45;
        assertFalse(solution.isPowerOfThree(n));
    }
}