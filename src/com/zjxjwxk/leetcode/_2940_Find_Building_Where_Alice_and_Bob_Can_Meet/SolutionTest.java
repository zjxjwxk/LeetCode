package com.zjxjwxk.leetcode._2940_Find_Building_Where_Alice_and_Bob_Can_Meet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void leftmostBuildingQueries() {
        int[] heights = {6, 4, 8, 5, 2, 7};
        int[][] queries = {{0, 1}, {0, 3}, {2, 4}, {3, 4}, {2, 2}};
        int[] ans = {2, 5, -1, 5, 2};
        assertArrayEquals(ans, solution.leftmostBuildingQueries(heights, queries));
    }

    @Test
    void leftmostBuildingQueries2() {
        int[] heights = {5, 3, 8, 2, 6, 1, 4, 6};
        int[][] queries = {{0, 7}, {3, 5}, {5, 2}, {3, 0}, {1, 6}};
        int[] ans = {7, 6, -1, 4, 6};
        assertArrayEquals(ans, solution.leftmostBuildingQueries(heights, queries));
    }
}