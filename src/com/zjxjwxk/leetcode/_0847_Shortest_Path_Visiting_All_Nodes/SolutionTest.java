package com.zjxjwxk.leetcode._0847_Shortest_Path_Visiting_All_Nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shortestPathLength1() {
        int[][] graph = {
                {1, 2, 3}, {0}, {0}, {0}
        };
        int ans = 4;
        assertEquals(ans, solution.shortestPathLength(graph));
    }

    @Test
    void shortestPathLength2() {
        int[][] graph = {
                {1}, {0, 2, 4}, {1, 3, 4}, {2}, {1, 2}
        };
        int ans = 4;
        assertEquals(ans, solution.shortestPathLength(graph));
    }
}