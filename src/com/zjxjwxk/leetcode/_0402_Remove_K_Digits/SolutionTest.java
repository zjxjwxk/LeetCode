package com.zjxjwxk.leetcode._0402_Remove_K_Digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeKdigits1() {
        String num = "1432219";
        int k = 3;
        String ans = "1219";
        assertEquals(ans, solution.removeKdigits(num, k));
    }

    @Test
    void removeKdigits2() {
        String num = "10200";
        int k = 1;
        String ans = "200";
        assertEquals(ans, solution.removeKdigits(num, k));
    }

    @Test
    void removeKdigits3() {
        String num = "10";
        int k = 2;
        String ans = "0";
        assertEquals(ans, solution.removeKdigits(num, k));
    }

    @Test
    void removeKdigits4() {
        String num = "9";
        int k = 1;
        String ans = "0";
        assertEquals(ans, solution.removeKdigits(num, k));
    }

    @Test
    void removeKdigits5() {
        String num = "112";
        int k = 1;
        String ans = "11";
        assertEquals(ans, solution.removeKdigits(num, k));
    }
}