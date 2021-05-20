package com.zjxjwxk.leetcode._0692_Top_K_Frequent_Words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void topKFrequent1() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> ans = Arrays.asList("i", "love");
        assertEquals(ans, solution2.topKFrequent(words, k));
    }

    @Test
    void topKFrequent2() {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> ans = Arrays.asList("the", "is", "sunny", "day");
        assertEquals(ans, solution2.topKFrequent(words, k));
    }
}