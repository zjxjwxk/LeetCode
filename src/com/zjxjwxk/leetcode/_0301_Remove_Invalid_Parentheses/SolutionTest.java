package com.zjxjwxk.leetcode._0301_Remove_Invalid_Parentheses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeInvalidParentheses1() {
        String s = "()())()";
        List<String> ans = Arrays.asList("(())()", "()()()");
        assertEquals(ans, solution.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses2() {
        String s = "(a)())()";
        List<String> ans = Arrays.asList("(a())()", "(a)()()");
        assertEquals(ans, solution.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses3() {
        String s = ")(";
        List<String> ans = Collections.singletonList("");
        assertEquals(ans, solution.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses4() {
        String s = "(()";
        List<String> ans = Collections.singletonList("()");
        assertEquals(ans, solution.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses5() {
        String s = "))";
        List<String> ans = Collections.singletonList("");
        assertEquals(ans, solution.removeInvalidParentheses(s));
    }

    @Test
    void removeInvalidParentheses6() {
        String s = ")()(";
        List<String> ans = Collections.singletonList("()");
        assertEquals(ans, solution.removeInvalidParentheses(s));
    }
}