package com.zjxjwxk.leetcode._0140_Word_Break_II;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void wordBreak() {
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> ans = Arrays.asList("cat sand dog", "cats and dog");
        assertEquals(ans, solution.wordBreak(s, wordDict));
        s =  "pineapplepenapple";
        wordDict = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        ans = Arrays.asList("pine apple pen apple",
                "pine applepen apple",
                "pineapple pen apple"
                );
        assertEquals(ans, solution.wordBreak(s, wordDict));
    }
}