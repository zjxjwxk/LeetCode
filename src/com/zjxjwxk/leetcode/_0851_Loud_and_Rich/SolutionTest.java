package com.zjxjwxk.leetcode._0851_Loud_and_Rich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void loudAndRich1() {
        int[][] richer = {{1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}};
        int[] quiet = {3, 2, 5, 4, 6, 1, 7, 0};
        int[] ans = {5, 5, 2, 5, 4, 5, 6, 7};
        assertArrayEquals(ans, solution.loudAndRich(richer, quiet));
    }

    @Test
    void loudAndRich2() {
        int[][] richer = {};
        int[] quiet = {0};
        int[] ans = {0};
        assertArrayEquals(ans, solution.loudAndRich(richer, quiet));
    }
}