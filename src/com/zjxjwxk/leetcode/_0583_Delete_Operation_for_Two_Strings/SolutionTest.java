package com.zjxjwxk.leetcode._0583_Delete_Operation_for_Two_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minDistance() {
        String word1 = "sea";
        String word2 = "eat";
        int ans = 2;
        assertEquals(ans, solution.minDistance(word1, word2));
    }
}