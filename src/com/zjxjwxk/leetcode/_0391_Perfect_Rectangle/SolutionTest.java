package com.zjxjwxk.leetcode._0391_Perfect_Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isRectangleCover1() {
        int[][] rectangles = {
                {1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}
        };
        assertTrue(solution.isRectangleCover(rectangles));
    }

    @Test
    void isRectangleCover2() {
        int[][] rectangles = {
                {1, 1, 2, 3}, {1, 3, 2, 4}, {3, 1, 4, 2}, {3, 2, 4, 4}
        };
        assertFalse(solution.isRectangleCover(rectangles));
    }

    @Test
    void isRectangleCover3() {
        int[][] rectangles = {
                {1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {3, 2, 4, 4}
        };
        assertFalse(solution.isRectangleCover(rectangles));
    }

    @Test
    void isRectangleCover4() {
        int[][] rectangles = {
                {1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {2, 2, 4, 4}
        };
        assertFalse(solution.isRectangleCover(rectangles));
    }

    @Test
    void isRectangleCover5() {
        int[][] rectangles = {
                {1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {2, 2, 4, 4}
        };
        assertFalse(solution.isRectangleCover(rectangles));
    }

    @Test
    void isRectangleCover6() {
        int[][] rectangles = {
                {0, 0, 1, 1}, {0, 0, 1, 1}, {1, 1, 2, 2}, {1, 1, 2, 2}
        };
        assertFalse(solution.isRectangleCover(rectangles));
    }
}