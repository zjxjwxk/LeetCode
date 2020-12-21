package com.zjxjwxk.leetcode._0316_Remove_Duplicate_Letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeDuplicateLetters1() {
        String s = "bcabc";
        String ans = "abc";
        assertEquals(ans, solution.removeDuplicateLetters(s));
    }

    @Test
    void removeDuplicateLetters2() {
        String s = "cbacdcbc";
        String ans = "acdb";
        assertEquals(ans, solution.removeDuplicateLetters(s));
    }
}