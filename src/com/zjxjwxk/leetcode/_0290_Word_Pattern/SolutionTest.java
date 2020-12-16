package com.zjxjwxk.leetcode._0290_Word_Pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void wordPattern1() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        assertTrue(solution.wordPattern(pattern, s));
    }

    @Test
    void wordPattern2() {
        String pattern = "abba";
        String s = "dog cat cat fish";
        assertFalse(solution.wordPattern(pattern, s));
    }

    @Test
    void wordPattern3() {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        assertFalse(solution.wordPattern(pattern, s));
    }

    @Test
    void wordPattern4() {
        String pattern = "abba";
        String s = "dog dog dog dog";
        assertFalse(solution.wordPattern(pattern, s));
    }
}