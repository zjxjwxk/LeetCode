package com.zjxjwxk.leetcode._0859_Buddy_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void buddyStrings1() {
        String s = "ab", goal = "ba";
        assertTrue(solution.buddyStrings(s, goal));
    }

    @Test
    void buddyStrings2() {
        String s = "ab", goal = "ab";
        assertFalse(solution.buddyStrings(s, goal));
    }

    @Test
    void buddyStrings3() {
        String s = "aa", goal = "aa";
        assertTrue(solution.buddyStrings(s, goal));
    }

    @Test
    void buddyStrings4() {
        String s = "aaaaaaabc", goal = "aaaaaaacb";
        assertTrue(solution.buddyStrings(s, goal));
    }
}