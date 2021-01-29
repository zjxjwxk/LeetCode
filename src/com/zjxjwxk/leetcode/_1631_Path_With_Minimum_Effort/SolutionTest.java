package com.zjxjwxk.leetcode._1631_Path_With_Minimum_Effort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumEffortPath1() {
        int[][] heights = {
                {1, 2, 2}, {3, 8, 2}, {5, 3, 5}
        };
        int ans = 2;
        assertEquals(ans, solution.minimumEffortPath(heights));
    }

    @Test
    void minimumEffortPath2() {
        int[][] heights = {
                {1, 2, 3}, {3, 8, 4}, {5, 3, 5}
        };
        int ans = 1;
        assertEquals(ans, solution.minimumEffortPath(heights));
    }

    @Test
    void minimumEffortPath3() {
        int[][] heights = {
                {1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}
        };
        int ans = 0;
        assertEquals(ans, solution.minimumEffortPath(heights));
    }

    @Test
    void minimumEffortPath4() {
        int[][] heights = {
                {3}
        };
        int ans = 0;
        assertEquals(ans, solution.minimumEffortPath(heights));
    }
}