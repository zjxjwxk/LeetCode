package com.zjxjwxk.leetcode._1579_Remove_Max_Number_of_Edges_to_Keep_Graph_Fully_Traversable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxNumEdgesToRemove1() {
        int n = 4;
        int[][] edges = {
                {3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}
        };
        int ans = 2;
        assertEquals(ans, solution.maxNumEdgesToRemove(n, edges));
    }

    @Test
    void maxNumEdgesToRemove2() {
        int n = 4;
        int[][] edges = {
                {3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}
        };
        int ans = 0;
        assertEquals(ans, solution.maxNumEdgesToRemove(n, edges));
    }

    @Test
    void maxNumEdgesToRemove3() {
        int n = 4;
        int[][] edges = {
                {3, 2, 3}, {1, 1, 2}, {2, 3, 4}
        };
        int ans = -1;
        assertEquals(ans, solution.maxNumEdgesToRemove(n, edges));
    }
}