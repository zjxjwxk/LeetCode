package com.zjxjwxk.leetcode._0224_Basic_Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void calculate1() {
        String s = "1 + 1";
        int ans = 2;
        assertEquals(ans, solution.calculate(s));
    }

    @Test
    void calculate2() {
        String s = " 2-1 + 2 ";
        int ans = 3;
        assertEquals(ans, solution.calculate(s));
    }

    @Test
    void calculate3() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int ans = 23;
        assertEquals(ans, solution.calculate(s));
    }

    @Test
    void calculate4() {
        String s = "-2+ 1";
        int ans = -1;
        assertEquals(ans, solution.calculate(s));
    }
}