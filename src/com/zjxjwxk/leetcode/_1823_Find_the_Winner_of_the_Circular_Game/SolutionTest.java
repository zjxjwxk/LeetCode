package com.zjxjwxk.leetcode._1823_Find_the_Winner_of_the_Circular_Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findTheWinner() {
        int n = 5, k = 2;
        int ans = 3;
        assertEquals(ans, solution.findTheWinner(n, k));
    }

    @Test
    void findTheWinner2() {
        int n = 6, k = 5;
        int ans = 1;
        assertEquals(ans, solution.findTheWinner(n, k));
    }
}