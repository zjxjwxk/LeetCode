package com.zjxjwxk.leetcode._0567_Permutation_in_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkInclusion1() {
        String s1 = "ab", s2 = "eidbaooo";
        assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion2() {
        String s1 = "ab", s2 = "eidboaoo";
        assertFalse(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion3() {
        String s1 = "a", s2 = "eidboaoo";
        assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion4() {
        String s1 = "a", s2 = "a";
        assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion5() {
        String s1 = "a", s2 = "bc";
        assertFalse(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion6() {
        String s1 = "adc", s2 = "dcda";
        assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion7() {
        String s1 = "hello", s2 = "ooolleoooleh";
        assertFalse(solution.checkInclusion(s1, s2));
    }
}