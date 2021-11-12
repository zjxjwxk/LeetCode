package com.zjxjwxk.leetcode._0520_Detect_Capital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void detectCapitalUse1() {
        String word = "USA";
        assertTrue(solution.detectCapitalUse(word));
    }

    @Test
    void detectCapitalUse2() {
        String word = "FlaG";
        assertFalse(solution.detectCapitalUse(word));
    }
}