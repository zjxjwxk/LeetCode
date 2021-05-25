package com.zjxjwxk.leetcode._0664_Strange_Printer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void strangePrinter1() {
        String s = "aaabbb";
        int ans = 2;
        assertEquals(ans, solution.strangePrinter(s));
    }

    @Test
    void strangePrinter2() {
        String s = "aba";
        int ans = 2;
        assertEquals(ans, solution.strangePrinter(s));
    }
}