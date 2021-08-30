package com.zjxjwxk.leetcode._0802_Find_Eventual_Safe_States;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void eventualSafeNodes1() {
        int[][] graph = {
                {1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}
        };
        List<Integer> ans = Arrays.asList(2, 4, 5, 6);
        assertEquals(ans, solution.eventualSafeNodes(graph));
    }

    @Test
    void eventualSafeNodes2() {
        int[][] graph = {
                {1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}
        };
        List<Integer> ans = Collections.singletonList(4);
        assertEquals(ans, solution.eventualSafeNodes(graph));
    }
}