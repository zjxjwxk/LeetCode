package com.zjxjwxk.leetcode._0877_Stone_Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void stoneGame() {
        int[] piles = {5, 3, 4, 5};
        assertTrue(solution.stoneGame(piles));
    }
}