package com.zjxjwxk.leetcode.LCP_40_Mental_Arithmetic_Challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();
    
    @Test
    void maxmiumScore() {
        int[] cards = {1, 2, 8, 9};
        int cnt = 3, ans = 18;
        assertEquals(ans, solution2.maxmiumScore(cards, cnt));
    }

    @Test
    void maxmiumScore2() {
        int[] cards = {3, 3, 1};
        int cnt = 1, ans = 0;
        assertEquals(ans, solution2.maxmiumScore(cards, cnt));
    }
}