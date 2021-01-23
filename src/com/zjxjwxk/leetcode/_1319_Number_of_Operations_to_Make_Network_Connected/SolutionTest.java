package com.zjxjwxk.leetcode._1319_Number_of_Operations_to_Make_Network_Connected;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void makeConnected() {
        int n = 4;
        int[][] connections = {
                {0, 1}, {0, 2}, {1, 2}
        };
        int ans = 1;
        assertEquals(ans, solution.makeConnected(n, connections));
    }

    @Test
    void makeConnected2() {
        int n = 6;
        int[][] connections = {
                {0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}
        };
        int ans = 2;
        assertEquals(ans, solution.makeConnected(n, connections));
    }

    @Test
    void makeConnected3() {
        int n = 6;
        int[][] connections = {
                {0, 1}, {0, 2}, {0, 3}, {1, 2}
        };
        int ans = -1;
        assertEquals(ans, solution.makeConnected(n, connections));
    }

    @Test
    void makeConnected4() {
        int n = 5;
        int[][] connections = {
                {0, 1}, {0, 2}, {3, 4}, {2, 3}
        };
        int ans = 0;
        assertEquals(ans, solution.makeConnected(n, connections));
    }
}