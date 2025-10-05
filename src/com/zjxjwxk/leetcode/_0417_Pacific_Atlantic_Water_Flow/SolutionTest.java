package com.zjxjwxk.leetcode._0417_Pacific_Atlantic_Water_Flow;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pacificAtlantic() {
        int[][] heights = {
                {1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 4}, {1, 3}, {1, 4}, {2, 2}, {3, 0}, {3, 1}, {4, 0}
        });
        assertEquals(ans, solution.pacificAtlantic(heights));
    }

    @Test
    void pacificAtlantic2() {
        int[][] heights = {
                {2, 1}, {1, 2}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 0}, {0, 1}, {1, 0}, {1, 1}
        });
        assertEquals(ans, solution.pacificAtlantic(heights));
    }
}