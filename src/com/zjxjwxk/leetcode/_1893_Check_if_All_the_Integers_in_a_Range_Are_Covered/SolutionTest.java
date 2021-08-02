package com.zjxjwxk.leetcode._1893_Check_if_All_the_Integers_in_a_Range_Are_Covered;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isCovered1() {
        int[][] ranges = {{1, 2}, {3, 4}, {5, 6}};
        int left = 2, right = 5;
        assertTrue(solution.isCovered(ranges, left, right));
    }

    @Test
    void isCovered2() {
        int[][] ranges = {{1, 10}, {10, 20}};
        int left = 21, right = 21;
        assertFalse(solution.isCovered(ranges, left, right));
    }
}