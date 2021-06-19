package com.zjxjwxk.leetcode._0877_Stone_Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void stoneGame() {
        int[] piles = {5, 3, 4, 5};
        assertTrue(solution2.stoneGame(piles));
    }
}