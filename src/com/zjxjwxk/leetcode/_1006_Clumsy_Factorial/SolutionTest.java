package com.zjxjwxk.leetcode._1006_Clumsy_Factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void clumsy1() {
        int N = 4;
        int ans = 7;
        assertEquals(ans, solution.clumsy(N));
    }

    @Test
    void clumsy2() {
        int N = 10;
        int ans = 12;
        assertEquals(ans, solution.clumsy(N));
    }
}