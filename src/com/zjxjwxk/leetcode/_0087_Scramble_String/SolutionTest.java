package com.zjxjwxk.leetcode._0087_Scramble_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isScramble1() {
        String s1 = "great";
        String s2 = "rgeat";
        assertTrue(solution.isScramble(s1, s2));
    }

    @Test
    void isScramble2() {
        String s1 = "abcde";
        String s2 = "caebd";
        assertFalse(solution.isScramble(s1, s2));
    }

    @Test
    void isScramble3() {
        String s1 = "a";
        String s2 = "a";
        assertTrue(solution.isScramble(s1, s2));
    }

    @Test
    void isScramble4() {
        String s1 = "hobby";
        String s2 = "byhob";
        assertTrue(solution.isScramble(s1, s2));
    }

    @Test
    void isScramble5() {
        String s1 = "hobby";
        String s2 = "ybbho";
        assertTrue(solution.isScramble(s1, s2));
    }
}