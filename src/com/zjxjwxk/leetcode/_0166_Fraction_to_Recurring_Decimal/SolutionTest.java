package com.zjxjwxk.leetcode._0166_Fraction_to_Recurring_Decimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void fractionToDecimal1() {
        int numerator = 1, denominator = 2;
        String ans = "0.5";
        assertEquals(ans, solution.fractionToDecimal(numerator, denominator));
    }

    @Test
    void fractionToDecimal2() {
        int numerator = 2, denominator = 1;
        String ans = "2";
        assertEquals(ans, solution.fractionToDecimal(numerator, denominator));
    }

    @Test
    void fractionToDecimal3() {
        int numerator = 2, denominator = 3;
        String ans = "0.(6)";
        assertEquals(ans, solution.fractionToDecimal(numerator, denominator));
    }

    @Test
    void fractionToDecimal4() {
        int numerator = 4, denominator = 333;
        String ans = "0.(012)";
        assertEquals(ans, solution.fractionToDecimal(numerator, denominator));
    }

    @Test
    void fractionToDecimal5() {
        int numerator = 1, denominator = 5;
        String ans = "0.2";
        assertEquals(ans, solution.fractionToDecimal(numerator, denominator));
    }

    @Test
    void fractionToDecimal6() {
        int numerator = 1, denominator = 6;
        String ans = "0.1(6)";
        assertEquals(ans, solution.fractionToDecimal(numerator, denominator));
    }

    @Test
    void fractionToDecimal7() {
        int numerator = -50, denominator = 8;
        String ans = "-6.25";
        assertEquals(ans, solution.fractionToDecimal(numerator, denominator));
    }

    @Test
    void fractionToDecimal8() {
        int numerator = -1, denominator = -2147483648;
        String ans = "0.0000000004656612873077392578125";
        assertEquals(ans, solution.fractionToDecimal(numerator, denominator));
    }
}