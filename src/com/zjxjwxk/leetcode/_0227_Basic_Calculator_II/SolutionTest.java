package com.zjxjwxk.leetcode._0227_Basic_Calculator_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void calculate1() {
        String s = "3+2*2";
        int ans = 7;
        assertEquals(ans, solution.calculate(s));
    }

    @Test
    void calculate2() {
        String s = " 3/2 ";
        int ans = 1;
        assertEquals(ans, solution.calculate(s));
    }

    @Test
    void calculate3() {
        String s = " 3+5 / 2 ";
        int ans = 5;
        assertEquals(ans, solution.calculate(s));
    }
}