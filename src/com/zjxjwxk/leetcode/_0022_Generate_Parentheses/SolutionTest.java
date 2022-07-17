package com.zjxjwxk.leetcode._0022_Generate_Parentheses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void generateParenthesis1() {
        int n = 3;
        List<String> ans = Arrays.asList("((()))","(()())","(())()","()(())","()()()");
        assertEquals(ans, solution.generateParenthesis(n));
    }

    @Test
    void generateParenthesis2() {
        int n = 1;
        List<String> ans = Collections.singletonList("()");
        assertEquals(ans, solution.generateParenthesis(n));
    }
}