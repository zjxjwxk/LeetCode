package com.zjxjwxk.leetcode._1178_Number_of_Valid_Words_for_Each_Puzzle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findNumOfValidWords() {
        String[] words = {"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = {"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        List<Integer> ans = Arrays.asList(1, 1, 3, 2, 4, 0);
        assertEquals(ans, solution.findNumOfValidWords(words, puzzles));
    }
}