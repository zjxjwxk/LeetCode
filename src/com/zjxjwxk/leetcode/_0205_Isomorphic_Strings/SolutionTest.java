package com.zjxjwxk.leetcode._0205_Isomorphic_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isIsomorphic1() {
        String s = "egg", t = "add";
        assertTrue(solution.isIsomorphic(s, t));
    }

    @Test
    void isIsomorphic2() {
        String s = "foo", t = "bar";
        assertFalse(solution.isIsomorphic(s, t));
    }

    @Test
    void isIsomorphic3() {
        String s = "paper", t = "title";
        assertTrue(solution.isIsomorphic(s, t));
    }
}