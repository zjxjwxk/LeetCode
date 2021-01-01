package com.zjxjwxk.leetcode._0435_Non_overlapping_Intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void eraseOverlapIntervals1() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int ans = 1;
        assertEquals(ans, solution.eraseOverlapIntervals(intervals));
    }

    @Test
    void eraseOverlapIntervals2() {
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        int ans = 2;
        assertEquals(ans, solution.eraseOverlapIntervals(intervals));
    }

    @Test
    void eraseOverlapIntervals3() {
        int[][] intervals = {{1,2}, {2,3}};
        int ans = 0;
        assertEquals(ans, solution.eraseOverlapIntervals(intervals));
    }
}