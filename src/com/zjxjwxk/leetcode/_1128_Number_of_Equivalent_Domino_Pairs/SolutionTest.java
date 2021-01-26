package com.zjxjwxk.leetcode._1128_Number_of_Equivalent_Domino_Pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numEquivDominoPairs1() {
        int[][] dominoes = {
                {1, 2}, {2, 1}, {3, 4}, {5, 6}
        };
        int ans = 1;
        assertEquals(ans, solution.numEquivDominoPairs(dominoes));
    }

    @Test
    void numEquivDominoPairs2() {
        int[][] dominoes = {
                {1, 2}, {2, 1}, {3, 4}, {4, 3}
        };
        int ans = 2;
        assertEquals(ans, solution.numEquivDominoPairs(dominoes));
    }

    @Test
    void numEquivDominoPairs3() {
        int[][] dominoes = {
                {1, 2}
        };
        int ans = 0;
        assertEquals(ans, solution.numEquivDominoPairs(dominoes));
    }

    @Test
    void numEquivDominoPairs4() {
        int[][] dominoes = {
                {1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}
        };
        int ans = 3;
        assertEquals(ans, solution.numEquivDominoPairs(dominoes));
    }

    @Test
    void numEquivDominoPairs5() {
        int[][] dominoes = {
                {1, 1}, {2, 2}, {1, 1}, {1, 2}, {1, 2}, {1, 1}
        };
        int ans = 4;
        assertEquals(ans, solution.numEquivDominoPairs(dominoes));
    }
}