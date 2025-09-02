package com.zjxjwxk.leetcode._0032_Longest_Valid_Parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestValidParentheses() {
        String s = "(()";
        int ans = 2;
        assertEquals(ans, solution.longestValidParentheses(s));
    }

    @Test
    void longestValidParentheses2() {
        String s = ")()())";
        int ans = 4;
        assertEquals(ans, solution.longestValidParentheses(s));
    }

    @Test
    void longestValidParentheses3() {
        String s = "";
        int ans = 0;
        assertEquals(ans, solution.longestValidParentheses(s));
    }
}