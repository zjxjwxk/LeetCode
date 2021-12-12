package com.zjxjwxk.leetcode._0709_To_Lower_Case;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void toLowerCase1() {
        String s = "Hello";
        String ans = "hello";
        assertEquals(ans, solution.toLowerCase(s));
    }

    @Test
    void toLowerCase2() {
        String s = "here";
        String ans = "here";
        assertEquals(ans, solution.toLowerCase(s));
    }

    @Test
    void toLowerCase3() {
        String s = "LOVELY";
        String ans = "lovely";
        assertEquals(ans, solution.toLowerCase(s));
    }
}