package com.zjxjwxk.leetcode._0345_Reverse_Vowels_of_a_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseVowels1() {
        String s = "hello";
        String ans = "holle";
        assertEquals(ans, solution.reverseVowels(s));
    }

    @Test
    void reverseVowels2() {
        String s = "leetcode";
        String ans = "leotcede";
        assertEquals(ans, solution.reverseVowels(s));
    }
}