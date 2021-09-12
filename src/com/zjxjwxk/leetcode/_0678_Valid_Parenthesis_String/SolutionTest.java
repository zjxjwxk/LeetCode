package com.zjxjwxk.leetcode._0678_Valid_Parenthesis_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkValidString1() {
        String s = "()";
        assertTrue(solution.checkValidString(s));
    }

    @Test
    void checkValidString2() {
        String s = "(*)";
        assertTrue(solution.checkValidString(s));
    }

    @Test
    void checkValidString3() {
        String s = "(*))";
        assertTrue(solution.checkValidString(s));
    }
}