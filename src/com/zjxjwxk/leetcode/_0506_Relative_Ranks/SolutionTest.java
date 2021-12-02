package com.zjxjwxk.leetcode._0506_Relative_Ranks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findRelativeRanks1() {
        int[] score = {5, 4, 3, 2, 1};
        String[] ans = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        assertArrayEquals(ans, solution.findRelativeRanks(score));
    }

    @Test
    void findRelativeRanks2() {
        int[] score = {10, 3, 8, 9, 4};
        String[] ans = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assertArrayEquals(ans, solution.findRelativeRanks(score));
    }
}