package com.zjxjwxk.leetcode._0383_Ransom_Note;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canConstruct1() {
        String ransomNote = "a", magazine = "b";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    void canConstruct2() {
        String ransomNote = "aa", magazine = "ab";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    void canConstruct3() {
        String ransomNote = "aa", magazine = "aab";
        assertTrue(solution.canConstruct(ransomNote, magazine));
    }
}