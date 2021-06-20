package com.zjxjwxk.leetcode._0065_Valid_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isNumber1() {
        String s = "0";
        assertTrue(solution.isNumber(s));
    }

    @Test
    void isNumber2() {
        String s = "e";
        assertFalse(solution.isNumber(s));
    }

    @Test
    void isNumber3() {
        String s = ".";
        assertFalse(solution.isNumber(s));
    }

    @Test
    void isNumber4() {
        String s = ".1";
        assertTrue(solution.isNumber(s));
    }
}