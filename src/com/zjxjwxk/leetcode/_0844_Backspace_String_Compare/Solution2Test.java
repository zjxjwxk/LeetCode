package com.zjxjwxk.leetcode._0844_Backspace_String_Compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void backspaceCompare1() {
        String str1 = "ab#c", str2 = "ad#c";
        assertTrue(solution2.backspaceCompare(str1, str2));
    }

    @Test
    void backspaceCompare2() {
        String str1 = "ab##", str2 = "c#d#";
        assertTrue(solution2.backspaceCompare(str1, str2));
    }

    @Test
    void backspaceCompare3() {
        String str1 = "a##c", str2 = "#a#c";
        assertTrue(solution2.backspaceCompare(str1, str2));
    }

    @Test
    void backspaceCompare4() {
        String str1 = "a#c", str2 = "b";
        assertFalse(solution2.backspaceCompare(str1, str2));
    }

    @Test
    void backspaceCompare5() {
        String str1 = "bxj##tw", str2 = "bxj###tw";
        assertFalse(solution2.backspaceCompare(str1, str2));
    }
}