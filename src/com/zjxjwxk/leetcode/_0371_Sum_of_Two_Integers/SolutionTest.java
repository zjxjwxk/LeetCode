package com.zjxjwxk.leetcode._0371_Sum_of_Two_Integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getSum1() {
        int a = 1, b = 2;
        int ans = 3;
        assertEquals(ans, solution.getSum(a, b));
    }

    @Test
    void getSum2() {
        int a = 2, b = 3;
        int ans = 5;
        assertEquals(ans, solution.getSum(a, b));
    }
}