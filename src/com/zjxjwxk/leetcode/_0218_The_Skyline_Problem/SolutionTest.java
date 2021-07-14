package com.zjxjwxk.leetcode._0218_The_Skyline_Problem;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getSkyline1() {
        int[][] buildings = {
                {2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {2, 10}, {3, 15}, {7, 12}, {12, 0}, {15, 10}, {20, 8}, {24, 0}
        });
        assertEquals(ans, solution.getSkyline(buildings));
    }

    @Test
    void getSkyline2() {
        int[][] buildings = {
                {0, 2, 3}, {2, 5, 3}
        };
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {0, 3}, {5, 0}
        });
        assertEquals(ans, solution.getSkyline(buildings));
    }
}