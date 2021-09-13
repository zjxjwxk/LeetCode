package com.zjxjwxk.leetcode._0541_Reverse_String_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseStr1() {
        String s = "abcdefg";
        int k = 2;
        String ans = "bacdfeg";
        assertEquals(ans, solution.reverseStr(s, k));
    }

    @Test
    void reverseStr2() {
        String s = "abcd";
        int k = 2;
        String ans = "bacd";
        assertEquals(ans, solution.reverseStr(s, k));
    }

    @Test
    void reverseStr3() {
        String s = "abcd";
        int k = 4;
        String ans = "dcba";
        assertEquals(ans, solution.reverseStr(s, k));
    }
}