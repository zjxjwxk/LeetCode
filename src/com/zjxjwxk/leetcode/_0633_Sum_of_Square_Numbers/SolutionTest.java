package com.zjxjwxk.leetcode._0633_Sum_of_Square_Numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void judgeSquareSum1() {
        int c = 5;
        assertTrue(solution.judgeSquareSum(c));
    }

    @Test
    void judgeSquareSum2() {
        int c = 3;
        assertFalse(solution.judgeSquareSum(c));
    }

    @Test
    void judgeSquareSum3() {
        int c = 4;
        assertTrue(solution.judgeSquareSum(c));
    }

    @Test
    void judgeSquareSum4() {
        int c = 2;
        assertTrue(solution.judgeSquareSum(c));
    }

    @Test
    void judgeSquareSum5() {
        int c = 1;
        assertTrue(solution.judgeSquareSum(c));
    }

    @Test
    void judgeSquareSum6() {
        int c = 0;
        assertTrue(solution.judgeSquareSum(c));
    }
}