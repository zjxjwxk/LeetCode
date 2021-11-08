package com.zjxjwxk.leetcode._0299_Bulls_and_Cows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getHint1() {
        String secret = "1807", guess = "7810";
        String ans = "1A3B";
        assertEquals(ans, solution.getHint(secret, guess));
    }

    @Test
    void getHint2() {
        String secret = "1123", guess = "0111";
        String ans = "1A1B";
        assertEquals(ans, solution.getHint(secret, guess));
    }

    @Test
    void getHint3() {
        String secret = "1", guess = "0";
        String ans = "0A0B";
        assertEquals(ans, solution.getHint(secret, guess));
    }

    @Test
    void getHint4() {
        String secret = "1", guess = "1";
        String ans = "1A0B";
        assertEquals(ans, solution.getHint(secret, guess));
    }

    @Test
    void getHint5() {
        String secret = "11", guess = "10";
        String ans = "1A0B";
        assertEquals(ans, solution.getHint(secret, guess));
    }
}