package com.zjxjwxk.leetcode._0008_String_to_Integer_atoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void myAtoi1() {
        String s = "42";
        int ans = 42;
        assertEquals(ans, solution2.myAtoi(s));
    }

    @Test
    void myAtoi2() {
        String s = "   -42";
        int ans = -42;
        assertEquals(ans, solution2.myAtoi(s));
    }

    @Test
    void myAtoi3() {
        String s = "4193 with words";
        int ans = 4193;
        assertEquals(ans, solution2.myAtoi(s));
    }

    @Test
    void myAtoi4() {
        String s = " ";
        int ans = 0;
        assertEquals(ans, solution2.myAtoi(s));
    }
}