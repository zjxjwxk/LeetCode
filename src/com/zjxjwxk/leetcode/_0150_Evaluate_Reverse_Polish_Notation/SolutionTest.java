package com.zjxjwxk.leetcode._0150_Evaluate_Reverse_Polish_Notation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void evalRPN1() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int ans = 9;
        assertEquals(ans, solution.evalRPN(tokens));
    }

    @Test
    void evalRPN2() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        int ans = 6;
        assertEquals(ans, solution.evalRPN(tokens));
    }

    @Test
    void evalRPN3() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int ans = 22;
        assertEquals(ans, solution.evalRPN(tokens));
    }
}