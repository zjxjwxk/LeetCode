package com.zjxjwxk.leetcode._0789_Escape_The_Ghosts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void escapeGhosts1() {
        int[][] ghosts = {
                {1, 0}, {0, 3}
        };
        int[] target = {0, 1};
        assertTrue(solution.escapeGhosts(ghosts, target));
    }

    @Test
    void escapeGhosts2() {
        int[][] ghosts = {
                {1, 0}
        };
        int[] target = {2, 0};
        assertFalse(solution.escapeGhosts(ghosts, target));
    }

    @Test
    void escapeGhosts3() {
        int[][] ghosts = {
                {2, 0}
        };
        int[] target = {1, 0};
        assertFalse(solution.escapeGhosts(ghosts, target));
    }

    @Test
    void escapeGhosts4() {
        int[][] ghosts = {
                {5, 0}, {-10, -2}, {0, -5}, {-2, -2}, {-7, 1}
        };
        int[] target = {7, 7};
        assertFalse(solution.escapeGhosts(ghosts, target));
    }

    @Test
    void escapeGhosts5() {
        int[][] ghosts = {
                {-1, 0}, {0, 1}, {-1, 0}, {0, 1}, {-1, 0}
        };
        int[] target = {0, 0};
        assertTrue(solution.escapeGhosts(ghosts, target));
    }
}