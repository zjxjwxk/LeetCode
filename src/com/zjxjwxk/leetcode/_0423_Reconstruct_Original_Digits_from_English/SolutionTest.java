package com.zjxjwxk.leetcode._0423_Reconstruct_Original_Digits_from_English;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void originalDigits1() {
        String s = "owoztneoer";
        String ans = "012";
        assertEquals(ans, solution.originalDigits(s));
    }

    @Test
    void originalDigits2() {
        String s = "fviefuro";
        String ans = "45";
        assertEquals(ans, solution.originalDigits(s));
    }
}