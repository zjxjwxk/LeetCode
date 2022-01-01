package com.zjxjwxk.leetcode._0507_Perfect_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkPerfectNumber1() {
        int num = 28;
        assertTrue(solution.checkPerfectNumber(num));
    }

    @Test
    void checkPerfectNumber2() {
        int num = 6;
        assertTrue(solution.checkPerfectNumber(num));
    }

    @Test
    void checkPerfectNumber3() {
        int num = 496;
        assertTrue(solution.checkPerfectNumber(num));
    }

    @Test
    void checkPerfectNumber4() {
        int num = 8128;
        assertTrue(solution.checkPerfectNumber(num));
    }

    @Test
    void checkPerfectNumber5() {
        int num = 2;
        assertFalse(solution.checkPerfectNumber(num));
    }

    @Test
    void checkPerfectNumber6() {
        int num = 4;
        assertFalse(solution.checkPerfectNumber(num));
    }

    @Test
    void checkPerfectNumber7() {
        int num = 1;
        assertFalse(solution.checkPerfectNumber(num));
    }
}