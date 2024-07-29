package com.zjxjwxk.leetcode._0682_Baseball_Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void calPoints() {
        String[] ops = {"5", "2", "C", "D", "+"};
        int ans = 30;
        assertEquals(ans, solution.calPoints(ops));
    }

    @Test
    void calPoints2() {
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        int ans = 27;
        assertEquals(ans, solution.calPoints(ops));
    }

    @Test
    void calPoints3() {
        String[] ops = {"1"};
        int ans = 1;
        assertEquals(ans, solution.calPoints(ops));
    }
}