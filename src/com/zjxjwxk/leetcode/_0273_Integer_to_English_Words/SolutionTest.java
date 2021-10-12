package com.zjxjwxk.leetcode._0273_Integer_to_English_Words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberToWords1() {
        int num = 123;
        String ans = "One Hundred Twenty Three";
        assertEquals(ans, solution.numberToWords(num));
    }

    @Test
    void numberToWords2() {
        int num = 12345;
        String ans = "Twelve Thousand Three Hundred Forty Five";
        assertEquals(ans, solution.numberToWords(num));
    }

    @Test
    void numberToWords3() {
        int num = 1234567;
        String ans = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";
        assertEquals(ans, solution.numberToWords(num));
    }

    @Test
    void numberToWords4() {
        int num = 1234567891;
        String ans = "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One";
        assertEquals(ans, solution.numberToWords(num));
    }

    @Test
    void numberToWords5() {
        int num = 101;
        String ans = "One Hundred One";
        assertEquals(ans, solution.numberToWords(num));
    }
}