package com.zjxjwxk.leetcode._0151_Reverse_Words_in_a_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseWords() {
        String s = "the sky is blue";
        String ans = "blue is sky the";
        assertEquals(ans, solution.reverseWords(s));
    }

    @Test
    void reverseWords2() {
        String s = "  hello world  ";
        String ans = "world hello";
        assertEquals(ans, solution.reverseWords(s));
    }

    @Test
    void reverseWords3() {
        String s = "a good   example";
        String ans = "example good a";
        assertEquals(ans, solution.reverseWords(s));
    }
}