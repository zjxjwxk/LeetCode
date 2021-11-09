package com.zjxjwxk.leetcode._0488_Zuma_Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMinStep1() {
        String board = "WRRBBW", hand = "RB";
        int ans = -1;
        assertEquals(ans, solution.findMinStep(board, hand));
    }

    @Test
    void findMinStep2() {
        String board = "WWRRBBWW", hand = "WRBRW";
        int ans = 2;
        assertEquals(ans, solution.findMinStep(board, hand));
    }

    @Test
    void findMinStep3() {
        String board = "G", hand = "GGGGG";
        int ans = 2;
        assertEquals(ans, solution.findMinStep(board, hand));
    }

    @Test
    void findMinStep4() {
        String board = "RBYYBBRRB", hand = "YRBGB";
        int ans = 3;
        assertEquals(ans, solution.findMinStep(board, hand));
    }

    @Test
    void findMinStep5() {
        String board = "RRWWRRBBRR", hand = "WB";
        int ans = 2;
        assertEquals(ans, solution.findMinStep(board, hand));
    }

    @Test
    void findMinStep6() {
        String board = "WWGWGW", hand = "GWBWR";
        int ans = 3;
        assertEquals(ans, solution.findMinStep(board, hand));
    }

    @Test
    void clean1() {
        StringBuilder sb = new StringBuilder("aaabbbccc");
        assertEquals("", solution.clean(sb).toString());
    }

    @Test
    void clean2() {
        StringBuilder sb = new StringBuilder("abbbccc");
        assertEquals("a", solution.clean(sb).toString());
    }

    @Test
    void clean3() {
        StringBuilder sb = new StringBuilder("aaabccc");
        assertEquals("b", solution.clean(sb).toString());
    }

    @Test
    void clean4() {
        StringBuilder sb = new StringBuilder("aabbbc");
        assertEquals("aac", solution.clean(sb).toString());
    }
}