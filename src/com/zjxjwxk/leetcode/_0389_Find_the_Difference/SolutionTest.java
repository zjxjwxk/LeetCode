package com.zjxjwxk.leetcode._0389_Find_the_Difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findTheDifference1() {
        String s = "abcd", t = "abcde";
        char ans = 'e';
        assertEquals(ans, solution.findTheDifference(s, t));
    }

    @Test
    void findTheDifference2() {
        String s = "", t = "y";
        char ans = 'y';
        assertEquals(ans, solution.findTheDifference(s, t));
    }

    @Test
    void findTheDifference3() {
        String s = "a", t = "aa";
        char ans = 'a';
        assertEquals(ans, solution.findTheDifference(s, t));
    }

    @Test
    void findTheDifference4() {
        String s = "ae", t = "aea";
        char ans = 'a';
        assertEquals(ans, solution.findTheDifference(s, t));
    }
}