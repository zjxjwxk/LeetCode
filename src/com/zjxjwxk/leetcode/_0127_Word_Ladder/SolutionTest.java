package com.zjxjwxk.leetcode._0127_Word_Ladder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void ladderLength1() {
        String beginWord = "hit", endWord = "cog";
        List<String> list = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        List<String> wordList = new ArrayList<>(list);
        assertEquals(5, solution.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    void ladderLength2() {
        String beginWord = "hit", endWord = "cog";
        List<String> list = Arrays.asList("hot", "dot", "dog", "lot", "log");
        List<String> wordList = new ArrayList<>(list);
        assertEquals(0, solution.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    void ladderLength3() {
        String beginWord = "hot", endWord = "dog";
        List<String> list = Arrays.asList("hot", "dog");
        List<String> wordList = new ArrayList<>(list);
        assertEquals(0, solution.ladderLength(beginWord, endWord, wordList));
    }
}