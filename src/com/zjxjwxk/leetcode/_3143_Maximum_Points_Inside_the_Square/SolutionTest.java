package com.zjxjwxk.leetcode._3143_Maximum_Points_Inside_the_Square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxPointsInsideSquare() {
        int[][] points = {{2, 2}, {-1, -2}, {-4, 4}, {-3, 1}, {3, -3}};
        String s = "abdca";
        int ans = 2;
        assertEquals(ans, solution.maxPointsInsideSquare(points, s));
    }

    @Test
    void maxPointsInsideSquare2() {
        int[][] points = {{1, 1}, {-2, -2}, {-2, 2}};
        String s = "abb";
        int ans = 1;
        assertEquals(ans, solution.maxPointsInsideSquare(points, s));
    }

    @Test
    void maxPointsInsideSquare3() {
        int[][] points = {{1, 1}, {-1, -1}, {2, -2}};
        String s = "ccd";
        int ans = 0;
        assertEquals(ans, solution.maxPointsInsideSquare(points, s));
    }
}