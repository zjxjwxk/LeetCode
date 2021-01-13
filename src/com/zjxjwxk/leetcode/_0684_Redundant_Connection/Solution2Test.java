package com.zjxjwxk.leetcode._0684_Redundant_Connection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void findRedundantConnection1() {
        int[][] edges = new int[][]{
                {1, 2}, {1, 3}, {2, 3}
        };
        int[] ans = {2, 3};
        assertArrayEquals(ans, solution2.findRedundantConnection(edges));
    }

    @Test
    void findRedundantConnection2() {
        int[][] edges = new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}
        };
        int[] ans = {1, 4};
        assertArrayEquals(ans, solution2.findRedundantConnection(edges));
    }

    @Test
    void findRedundantConnection3() {
        int[][] edges = new int[][]{
                {2, 7}, {7, 8}, {3, 6}, {2, 5}, {6, 8}, {4, 8}, {2, 8}, {1, 8}, {7, 10}, {3, 9}
        };
        int[] ans = {2, 8};
        assertArrayEquals(ans, solution2.findRedundantConnection(edges));
    }
}