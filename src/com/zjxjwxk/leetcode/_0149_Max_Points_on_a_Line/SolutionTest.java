package com.zjxjwxk.leetcode._0149_Max_Points_on_a_Line;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxPoints1() {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        int ans = 3;
        assertEquals(ans, solution.maxPoints(points));
    }

    @Test
    void maxPoints2() {
        int[][] points = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        int ans = 4;
        assertEquals(ans, solution.maxPoints(points));
    }

    @Test
    void maxPoints3() {
        int[][] points = {{3, 3}, {1, 4}, {1, 1}, {2, 1}, {2, 2}};
        int ans = 3;
        assertEquals(ans, solution.maxPoints(points));
    }

    @Test
    void maxPoints4() {
        int[][] points = {{4, 5}, {4, -1}, {4, 0}};
        int ans = 3;
        assertEquals(ans, solution.maxPoints(points));
    }
}