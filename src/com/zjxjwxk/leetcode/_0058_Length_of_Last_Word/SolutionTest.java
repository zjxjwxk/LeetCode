package com.zjxjwxk.leetcode._0058_Length_of_Last_Word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lengthOfLastWord() {
        String s = "Hello World";
        int ans = 5;
        assertEquals(ans, solution.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord2() {
        String s = "   fly me   to   the moon  ";
        int ans = 4;
        assertEquals(ans, solution.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord3() {
        String s = "luffy is still joyboy";
        int ans = 6;
        assertEquals(ans, solution.lengthOfLastWord(s));
    }
}