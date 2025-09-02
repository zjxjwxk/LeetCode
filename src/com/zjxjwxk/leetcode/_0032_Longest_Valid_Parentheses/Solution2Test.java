package com.zjxjwxk.leetcode._0032_Longest_Valid_Parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void longestValidParentheses() {
        String s = "(()";
        int ans = 2;
        assertEquals(ans, solution2.longestValidParentheses(s));
    }

    @Test
    void longestValidParentheses2() {
        String s = ")()())";
        int ans = 4;
        assertEquals(ans, solution2.longestValidParentheses(s));
    }

    @Test
    void longestValidParentheses3() {
        String s = "";
        int ans = 0;
        assertEquals(ans, solution2.longestValidParentheses(s));
    }
}