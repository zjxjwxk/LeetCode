package com.zjxjwxk.leetcode._1489_Find_Critical_and_Pseudo_Critical_Edges_in_Minimum_Spanning_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findCriticalAndPseudoCriticalEdges1() {
        int n = 5;
        int[][] edges = {
                {0, 1, 1}, {1, 2, 1}, {2, 3, 2}, {0, 3, 2}, {0, 4, 3}, {3, 4, 3}, {1, 4, 6}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 1}, {2, 3, 4, 5}
        });
        assertEquals(ans, solution.findCriticalAndPseudoCriticalEdges(n, edges));
    }

    @Test
    void findCriticalAndPseudoCriticalEdges2() {
        int n = 4;
        int[][] edges = {
                {0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {0, 3, 1}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {}, {0, 1, 2, 3}
        });
        assertEquals(ans, solution.findCriticalAndPseudoCriticalEdges(n, edges));
    }

    @Test
    void findCriticalAndPseudoCriticalEdges3() {
        int n = 2;
        int[][] edges = {
                {0, 1, 1}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0}, {}
        });
        assertEquals(ans, solution.findCriticalAndPseudoCriticalEdges(n, edges));
    }
}