package com.zjxjwxk.leetcode._3106_Lexicographically_Smallest_String_After_Operations_With_Constraint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getSmallestString() {
        String s = "zbbz";
        int k = 3;
        String ans = "aaaz";
        assertEquals(ans, solution.getSmallestString(s, k));
    }

    @Test
    void getSmallestString2() {
        String s = "xaxcd";
        int k = 4;
        String ans = "aawcd";
        assertEquals(ans, solution.getSmallestString(s, k));
    }

    @Test
    void getSmallestString3() {
        String s = "lol";
        int k = 0;
        String ans = "lol";
        assertEquals(ans, solution.getSmallestString(s, k));
    }
}