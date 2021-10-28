package com.zjxjwxk.leetcode._0301_Remove_Invalid_Parentheses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void removeInvalidParentheses1() {
        String s = "()())()";
        List<String> ans = Arrays.asList("(())()", "()()()");
        assertEquals(ans, solution2.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses2() {
        String s = "(a)())()";
        List<String> ans = Arrays.asList("(a())()", "(a)()()");
        assertEquals(ans, solution2.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses3() {
        String s = ")(";
        List<String> ans = Collections.singletonList("");
        assertEquals(ans, solution2.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses4() {
        String s = "(()";
        List<String> ans = Collections.singletonList("()");
        assertEquals(ans, solution2.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses5() {
        String s = "))";
        List<String> ans = Collections.singletonList("");
        assertEquals(ans, solution2.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses6() {
        String s = ")()(";
        List<String> ans = Collections.singletonList("()");
        assertEquals(ans, solution2.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses7() {
        String s = "(())(";
        List<String> ans = Collections.singletonList("(())");
        assertEquals(ans, solution2.removeInvalidParentheses(s));
    }
}