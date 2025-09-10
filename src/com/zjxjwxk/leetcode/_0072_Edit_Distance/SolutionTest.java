package com.zjxjwxk.leetcode._0072_Edit_Distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minDistance() {
        String word1 = "horse", word2 = "ros";
        int ans = 3;
        assertEquals(ans, solution.minDistance(word1, word2));
    }

    @Test
    void minDistance2() {
        String word1 = "intention", word2 = "execution";
        int ans = 5;
        assertEquals(ans, solution.minDistance(word1, word2));
    }
}