package com.zjxjwxk.leetcode._0678_Valid_Parenthesis_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void checkValidString1() {
        String s = "()";
        assertTrue(solution2.checkValidString(s));
    }

    @Test
    void checkValidString2() {
        String s = "(*)";
        assertTrue(solution2.checkValidString(s));
    }

    @Test
    void checkValidString3() {
        String s = "(*))";
        assertTrue(solution2.checkValidString(s));
    }
}