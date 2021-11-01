package com.zjxjwxk.leetcode._0500_Keyboard_Row;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution solution = new Solution();

    @Test
    void findWords1() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] ans = {"Alaska", "Dad"};
        assertArrayEquals(ans, solution.findWords(words));
    }

    @Test
    void findWords2() {
        String[] words = {"omk"};
        String[] ans = {};
        assertArrayEquals(ans, solution.findWords(words));
    }

    @Test
    void findWords3() {
        String[] words = {"adsdf", "sfd"};
        String[] ans = {"adsdf", "sfd"};
        assertArrayEquals(ans, solution.findWords(words));
    }
}