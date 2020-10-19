package com.zjxjwxk.leetcode._0844_Backspace_String_Compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void backspaceCompare1() {
        String str1 = "ab#c", str2 = "ad#c";
        assertTrue(solution.backspaceCompare(str1, str2));
    }

    @Test
    void backspaceCompare2() {
        String str1 = "ab##", str2 = "c#d#";
        assertTrue(solution.backspaceCompare(str1, str2));
    }

    @Test
    void backspaceCompare3() {
        String str1 = "a##c", str2 = "#a#c";
        assertTrue(solution.backspaceCompare(str1, str2));
    }

    @Test
    void backspaceCompare4() {
        String str1 = "a#c", str2 = "b";
        assertFalse(solution.backspaceCompare(str1, str2));
    }
}