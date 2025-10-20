package com.zjxjwxk.leetcode._0030_Substring_with_Concatenation_of_All_Words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findSubstring() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> ans = Arrays.asList(0, 9);
        assertEquals(ans, solution.findSubstring(s, words));
    }

    @Test
    void findSubstring2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        List<Integer> ans = Collections.emptyList();
        assertEquals(ans, solution.findSubstring(s, words));
    }

    @Test
    void findSubstring3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};
        List<Integer> ans = Arrays.asList(6, 9, 12);
        assertEquals(ans, solution.findSubstring(s, words));
    }
}