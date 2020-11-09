package com.zjxjwxk.leetcode._0973_K_Closest_Points_to_Origin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void kClosest1() {
        int[][] points = {{1, 3}, {-2, 2}};
        int K = 1;
        int[][] ans = new int[][]{{-2, 2}};
        int[][] result = solution2.kClosest(points, K);
        assertArrayEquals(ans, result);
    }

    @Test
    void kClosest2() {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int K = 2;
        int[][] ans = {{3, 3}, {-2, 4}};
        int[][] result = solution2.kClosest(points, K);
        assertArrayEquals(ans, result);
    }
}