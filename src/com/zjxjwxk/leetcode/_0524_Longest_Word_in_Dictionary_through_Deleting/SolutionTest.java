package com.zjxjwxk.leetcode._0524_Longest_Word_in_Dictionary_through_Deleting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findLongestWord1() {
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("ale", "apple", "monkey", "plea");
        String ans = "apple";
        assertEquals(ans, solution.findLongestWord(s, dictionary));
    }

    @Test
    void findLongestWord2() {
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("a", "b", "c");
        String ans = "a";
        assertEquals(ans, solution.findLongestWord(s, dictionary));
    }

    @Test
    void findLongestWord3() {
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("ale", "apple", "monkey", "plea", "abpcplaaa", "abpcllllll", "abccclllpppeeaaaa");
        String ans = "apple";
        assertEquals(ans, solution.findLongestWord(s, dictionary));
    }
}