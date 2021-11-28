package com.zjxjwxk.leetcode._0438_Find_All_Anagrams_in_a_String;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void findAnagrams1() {
        String s = "cbaebabacd", p = "abc";
        List<Integer> ans = Arrays.asList(0, 6);
        assertEquals(ans, solution2.findAnagrams(s, p));
    }

    @Test
    void findAnagrams2() {
        String s = "abab", p = "ab";
        List<Integer> ans = Arrays.asList(0, 1, 2);
        assertEquals(ans, solution2.findAnagrams(s, p));
    }

    @Test
    void findAnagrams3() {
        String s = "bpaa", p = "aa";
        List<Integer> ans = Collections.singletonList(2);
        assertEquals(ans, solution2.findAnagrams(s, p));
    }
}