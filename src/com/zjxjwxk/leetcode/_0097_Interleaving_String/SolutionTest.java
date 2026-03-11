package com.zjxjwxk.leetcode._0097_Interleaving_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isInterleave() {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        assertTrue(solution.isInterleave(s1, s2, s3));
    }

    @Test
    void isInterleave2() {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
        assertFalse(solution.isInterleave(s1, s2, s3));
    }

    @Test
    void isInterleave3() {
        String s1 = "", s2 = "", s3 = "";
        assertTrue(solution.isInterleave(s1, s2, s3));
    }
}