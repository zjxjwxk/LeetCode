package com.zjxjwxk.leetcode._0139_Word_Break;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void wordBreak() {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        assertTrue(solution2.wordBreak(s, wordDict));
        s = "applepenapple";
        wordDict = Arrays.asList("apple", "pen");
        assertTrue(solution2.wordBreak(s, wordDict));
        s = "catsandog";
        wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertFalse(solution2.wordBreak(s, wordDict));
        s = "aaaaaaa";
        wordDict = Arrays.asList("aaaa", "aaa");
        assertTrue(solution2.wordBreak(s, wordDict));
        s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        wordDict = Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa");
        assertFalse(solution2.wordBreak(s, wordDict));
    }
}