package com.zjxjwxk.leetcode.LCP_07_Send_Message;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numWays1() {
        int n = 5;
        int[][] relation = {
                {0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}
        };
        int k = 3;
        int ans = 3;
        assertEquals(ans, solution.numWays(n, relation, k));
    }

    @Test
    void numWays2() {
        int n = 3;
        int[][] relation = {
                {0, 2}, {2, 1}
        };
        int k = 2;
        int ans = 0;
        assertEquals(ans, solution.numWays(n, relation, k));
    }
}