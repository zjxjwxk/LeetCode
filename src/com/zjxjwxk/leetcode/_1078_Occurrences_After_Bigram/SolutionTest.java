package com.zjxjwxk.leetcode._1078_Occurrences_After_Bigram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findOcurrences1() {
        String text = "alice is a good girl she is a good student";
        String first = "a", second = "good";
        String[] ans = {"girl", "student"};
        assertArrayEquals(ans, solution.findOcurrences(text, first, second));
    }

    @Test
    void findOcurrences2() {
        String text = "we will we will rock you";
        String first = "we", second = "will";
        String[] ans = {"we", "rock"};
        assertArrayEquals(ans, solution.findOcurrences(text, first, second));
    }
}