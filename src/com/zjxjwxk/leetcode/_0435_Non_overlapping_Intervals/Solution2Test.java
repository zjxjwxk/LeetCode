package com.zjxjwxk.leetcode._0435_Non_overlapping_Intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void eraseOverlapIntervals1() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int ans = 1;
        assertEquals(ans, solution2.eraseOverlapIntervals(intervals));
    }

    @Test
    void eraseOverlapIntervals2() {
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        int ans = 2;
        assertEquals(ans, solution2.eraseOverlapIntervals(intervals));
    }

    @Test
    void eraseOverlapIntervals3() {
        int[][] intervals = {{1,2}, {2,3}};
        int ans = 0;
        assertEquals(ans, solution2.eraseOverlapIntervals(intervals));
    }

    @Test
    void eraseOverlapIntervals4() {
        int[][] intervals = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        int ans = 2;
        assertEquals(ans, solution2.eraseOverlapIntervals(intervals));
    }
}