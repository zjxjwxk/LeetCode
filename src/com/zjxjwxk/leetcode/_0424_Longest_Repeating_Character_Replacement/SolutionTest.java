package com.zjxjwxk.leetcode._0424_Longest_Repeating_Character_Replacement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void characterReplacement1() {
        String s = "ABAB";
        int k = 2;
        int ans = 4;
        assertEquals(ans, solution.characterReplacement(s, k));
    }

    @Test
    void characterReplacement2() {
        String s = "AABABBA";
        int k = 1;
        int ans = 4;
        assertEquals(ans, solution.characterReplacement(s, k));
    }

    @Test
    void characterReplacement3() {
        String s = "AABA";
        int k = 0;
        int ans = 2;
        assertEquals(ans, solution.characterReplacement(s, k));
    }

    @Test
    void characterReplacement4() {
        String s = "ABBB";
        int k = 0;
        int ans = 3;
        assertEquals(ans, solution.characterReplacement(s, k));
    }
}