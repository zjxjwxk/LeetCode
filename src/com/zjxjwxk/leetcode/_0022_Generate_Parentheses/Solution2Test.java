package com.zjxjwxk.leetcode._0022_Generate_Parentheses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void generateParenthesis1() {
        int n = 3;
        List<String> ans = Arrays.asList("((()))","(()())","(())()","()(())","()()()");
        assertEquals(ans, solution2.generateParenthesis(n));
    }

    @Test
    void generateParenthesis2() {
        int n = 1;
        List<String> ans = Collections.singletonList("()");
        assertEquals(ans, solution2.generateParenthesis(n));
    }
}