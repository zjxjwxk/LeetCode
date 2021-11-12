package com.zjxjwxk.leetcode._0375_Guess_Number_Higher_or_Lower_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getMoneyAmount1() {
        int n = 10;
        int ans = 16;
        assertEquals(ans, solution.getMoneyAmount(n));
    }

    @Test
    void getMoneyAmount2() {
        int n = 1;
        int ans = 0;
        assertEquals(ans, solution.getMoneyAmount(n));
    }

    @Test
    void getMoneyAmount3() {
        int n = 2;
        int ans = 1;
        assertEquals(ans, solution.getMoneyAmount(n));
    }
}