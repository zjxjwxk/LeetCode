package com.zjxjwxk.leetcode._0020_Valid_Parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isValid() {
        String s = "()";
        assertTrue(solution.isValid(s));
    }

    @Test
    void isValid2() {
        String s = "()[]{}";
        assertTrue(solution.isValid(s));
    }

    @Test
    void isValid3() {
        String s = "(]";
        assertFalse(solution.isValid(s));
    }

    @Test
    void isValid4() {
        String s = "([])";
        assertTrue(solution.isValid(s));
    }

    @Test
    void isValid5() {
        String s = "([)]";
        assertFalse(solution.isValid(s));
    }
}