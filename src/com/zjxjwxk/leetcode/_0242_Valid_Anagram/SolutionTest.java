package com.zjxjwxk.leetcode._0242_Valid_Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isAnagram1() {
        String s = "anagram", t = "nagaram";
        assertTrue(solution.isAnagram(s, t));
    }

    @Test
    void isAnagram2() {
        String s = "rat", t = "car";
        assertFalse(solution.isAnagram(s, t));
    }
}