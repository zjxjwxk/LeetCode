package com.zjxjwxk.leetcode._0057_Insert_Interval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    public void test1() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] ans = {{1, 5}, {6, 9}};
        assertArrayEquals(solution2.insert(intervals, newInterval), ans);
    }

    @Test
    public void test2() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] ans = {{1, 2}, {3, 10}, {12, 16}};
        assertArrayEquals(solution2.insert(intervals, newInterval), ans);
    }

    @Test
    public void test3() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {2, 7};
        int[][] ans = {{1, 7}};
        assertArrayEquals(solution2.insert(intervals, newInterval), ans);
    }
}