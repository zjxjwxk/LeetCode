package com.zjxjwxk.leetcode._0367_Valid_Perfect_Square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isPerfectSquare1() {
        int num = 16;
        assertTrue(solution.isPerfectSquare(num));
    }

    @Test
    void isPerfectSquare2() {
        int num = 14;
        assertFalse(solution.isPerfectSquare(num));
    }

    @Test
    void isPerfectSquare3() {
        int num = 2147483647;
        assertFalse(solution.isPerfectSquare(num));
    }
}