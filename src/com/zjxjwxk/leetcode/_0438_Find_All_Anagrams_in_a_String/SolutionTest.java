package com.zjxjwxk.leetcode._0438_Find_All_Anagrams_in_a_String;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findAnagrams1() {
        String s = "cbaebabacd", p = "abc";
        List<Integer> ans = Arrays.asList(0, 6);
        assertEquals(ans, solution.findAnagrams(s, p));
    }

    @Test
    void findAnagrams2() {
        String s = "abab", p = "ab";
        List<Integer> ans = Arrays.asList(0, 1, 2);
        assertEquals(ans, solution.findAnagrams(s, p));
    }
}