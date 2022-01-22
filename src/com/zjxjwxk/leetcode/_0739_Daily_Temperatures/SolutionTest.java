package com.zjxjwxk.leetcode._0739_Daily_Temperatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void dailyTemperatures1() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(ans, solution.dailyTemperatures(temperatures));
    }

    @Test
    void dailyTemperatures2() {
        int[] temperatures = {30, 40, 50, 60};
        int[] ans = {1, 1, 1, 0};
        assertArrayEquals(ans, solution.dailyTemperatures(temperatures));
    }

    @Test
    void dailyTemperatures3() {
        int[] temperatures = {30, 60, 90};
        int[] ans = {1, 1, 0};
        assertArrayEquals(ans, solution.dailyTemperatures(temperatures));
    }
}