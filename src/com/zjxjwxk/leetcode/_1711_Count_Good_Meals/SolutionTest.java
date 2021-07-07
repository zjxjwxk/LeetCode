package com.zjxjwxk.leetcode._1711_Count_Good_Meals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countPairs1() {
        int[] deliciousness = {1, 3, 5, 7, 9};
        int ans = 4;
        assertEquals(ans, solution.countPairs(deliciousness));
    }

    @Test
    void countPairs2() {
        int[] deliciousness = {1, 1, 1, 3, 3, 3, 7};
        int ans = 15;
        assertEquals(ans, solution.countPairs(deliciousness));
    }
}