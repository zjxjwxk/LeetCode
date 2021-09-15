package com.zjxjwxk.leetcode._0797_All_Paths_From_Source_to_Target;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void allPathsSourceTarget1() {
        int[][] graph = {
                {1, 2}, {3}, {3}, {}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 1, 3}, {0, 2, 3}
        });
        assertEquals(ans, solution.allPathsSourceTarget(graph));
    }

    @Test
    void allPathsSourceTarget2() {
        int[][] graph = {
                {4, 3, 1}, {3, 2, 4}, {3}, {4}, {}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 4}, {0, 3, 4}, {0, 1, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 4}
        });
        assertEquals(ans, solution.allPathsSourceTarget(graph));
    }

    @Test
    void allPathsSourceTarget3() {
        int[][] graph = {
                {1}, {}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 1}
        });
        assertEquals(ans, solution.allPathsSourceTarget(graph));
    }

    @Test
    void allPathsSourceTarget4() {
        int[][] graph = {
                {1, 2, 3}, {2}, {3}, {}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 1, 2, 3}, {0, 2, 3}, {0, 3}
        });
        assertEquals(ans, solution.allPathsSourceTarget(graph));
    }

    @Test
    void allPathsSourceTarget5() {
        int[][] graph = {
                {1, 3}, {2}, {3}, {}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 1, 2, 3}, {0, 3}
        });
        assertEquals(ans, solution.allPathsSourceTarget(graph));
    }
}