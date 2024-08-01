package com.zjxjwxk.leetcode.LCP_40_Mental_Arithmetic_Challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();
    
    @Test
    void maxmiumScore() {
        int[] cards = {1, 2, 8, 9};
        int cnt = 3, ans = 18;
        assertEquals(ans, solution.maxmiumScore(cards, cnt));
    }

    @Test
    void maxmiumScore2() {
        int[] cards = {3, 3, 1};
        int cnt = 1, ans = 0;
        assertEquals(ans, solution.maxmiumScore(cards, cnt));
    }
}