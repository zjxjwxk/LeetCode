package com.zjxjwxk.leetcode._0056_Merge_Intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void merge() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] ans = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(ans, solution.merge(intervals));
    }

    @Test
    void merge2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] ans = {{1, 5}};
        assertArrayEquals(ans, solution.merge(intervals));
    }
}