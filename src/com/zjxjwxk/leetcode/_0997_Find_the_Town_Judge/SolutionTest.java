package com.zjxjwxk.leetcode._0997_Find_the_Town_Judge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findJudge1() {
        int n = 2;
        int[][] trust = {{1, 2}};
        int ans = 2;
        assertEquals(ans, solution.findJudge(n, trust));
    }

    @Test
    void findJudge2() {
        int n = 3;
        int[][] trust = {{1, 3}, {2, 3}};
        int ans = 3;
        assertEquals(ans, solution.findJudge(n, trust));
    }

    @Test
    void findJudge3() {
        int n = 3;
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
        int ans = -1;
        assertEquals(ans, solution.findJudge(n, trust));
    }

    @Test
    void findJudge4() {
        int n = 3;
        int[][] trust = {{1, 2}, {2, 3}};
        int ans = -1;
        assertEquals(ans, solution.findJudge(n, trust));
    }

    @Test
    void findJudge5() {
        int n = 4;
        int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int ans = 3;
        assertEquals(ans, solution.findJudge(n, trust));
    }
}