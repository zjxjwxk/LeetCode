package com.zjxjwxk.leetcode._1816_Truncate_Sentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void truncateSentence1() {
        String s = "Hello how are you Contestant";
        int k = 4;
        String ans = "Hello how are you";
        assertEquals(ans, solution.truncateSentence(s, k));
    }

    @Test
    void truncateSentence2() {
        String s = "What is the solution to this problem";
        int k = 4;
        String ans = "What is the solution";
        assertEquals(ans, solution.truncateSentence(s, k));
    }

    @Test
    void truncateSentence3() {
        String s = "chopper is not a tanuki";
        int k = 5;
        String ans = "chopper is not a tanuki";
        assertEquals(ans, solution.truncateSentence(s, k));
    }
}