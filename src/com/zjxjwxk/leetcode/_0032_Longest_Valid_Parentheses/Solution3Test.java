package com.zjxjwxk.leetcode._0032_Longest_Valid_Parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void longestValidParentheses() {
        String s = "(()";
        int ans = 2;
        assertEquals(ans, solution3.longestValidParentheses(s));
    }

    @Test
    void longestValidParentheses2() {
        String s = ")()())";
        int ans = 4;
        assertEquals(ans, solution3.longestValidParentheses(s));
    }

    @Test
    void longestValidParentheses3() {
        String s = "";
        int ans = 0;
        assertEquals(ans, solution3.longestValidParentheses(s));
    }
}