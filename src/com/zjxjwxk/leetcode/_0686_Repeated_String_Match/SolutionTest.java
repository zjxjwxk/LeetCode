package com.zjxjwxk.leetcode._0686_Repeated_String_Match;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void repeatedStringMatch1() {
        String a = "abcd", b = "cdabcdab";
        int ans = 3;
        assertEquals(ans, solution.repeatedStringMatch(a, b));
    }

    @Test
    void repeatedStringMatch2() {
        String a = "a", b = "aa";
        int ans = 2;
        assertEquals(ans, solution.repeatedStringMatch(a, b));
    }

    @Test
    void repeatedStringMatch3() {
        String a = "a", b = "a";
        int ans = 1;
        assertEquals(ans, solution.repeatedStringMatch(a, b));
    }

    @Test
    void repeatedStringMatch4() {
        String a = "abc", b = "wxyz";
        int ans = -1;
        assertEquals(ans, solution.repeatedStringMatch(a, b));
    }

    @Test
    void repeatedStringMatch5() {
        String a = "aa", b = "a";
        int ans = 1;
        assertEquals(ans, solution.repeatedStringMatch(a, b));
    }

    @Test
    void repeatedStringMatch6() {
        String a = "abcd", b = "bc";
        int ans = 1;
        assertEquals(ans, solution.repeatedStringMatch(a, b));
    }

    @Test
    void repeatedStringMatch7() {
        String a = "abc", b = "cabcabca";
        int ans = 4;
        assertEquals(ans, solution.repeatedStringMatch(a, b));
    }
}