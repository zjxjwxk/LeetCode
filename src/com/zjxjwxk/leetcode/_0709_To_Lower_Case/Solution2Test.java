package com.zjxjwxk.leetcode._0709_To_Lower_Case;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void toLowerCase1() {
        String s = "Hello";
        String ans = "hello";
        assertEquals(ans, solution2.toLowerCase(s));
    }

    @Test
    void toLowerCase2() {
        String s = "here";
        String ans = "here";
        assertEquals(ans, solution2.toLowerCase(s));
    }

    @Test
    void toLowerCase3() {
        String s = "LOVELY";
        String ans = "lovely";
        assertEquals(ans, solution2.toLowerCase(s));
    }
}