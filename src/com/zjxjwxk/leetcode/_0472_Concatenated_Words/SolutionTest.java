package com.zjxjwxk.leetcode._0472_Concatenated_Words;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findAllConcatenatedWordsInADict1() {
        String[] words = {"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        List<String> ans = Arrays.asList("dogcatsdog", "catsdogcats", "ratcatdogcat");
        assertEquals(ans, solution.findAllConcatenatedWordsInADict(words));
    }

    @Test
    void findAllConcatenatedWordsInADict2() {
        String[] words = {"cat", "dog", "catdog"};
        List<String> ans = Collections.singletonList("catdog");
        assertEquals(ans, solution.findAllConcatenatedWordsInADict(words));
    }

    @Test
    void findAllConcatenatedWordsInADict3() {
        String[] words = {"cats", "cat", "sdog", "catsdog"};
        List<String> ans = Collections.singletonList("catsdog");
        assertEquals(ans, solution.findAllConcatenatedWordsInADict(words));
    }

    @Test
    void findAllConcatenatedWordsInADict4() {
        String[] words = {""};
        List<String> ans = new ArrayList<>();
        assertEquals(ans, solution.findAllConcatenatedWordsInADict(words));
    }
}