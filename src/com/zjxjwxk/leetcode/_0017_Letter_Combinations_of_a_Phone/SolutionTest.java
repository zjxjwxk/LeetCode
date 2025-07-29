package com.zjxjwxk.leetcode._0017_Letter_Combinations_of_a_Phone;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void letterCombinations() {
        String digits = "23";
        List<String> ans = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(ans, solution.letterCombinations(digits));
    }

    @Test
    void letterCombinations2() {
        String digits = "";
        List<String> ans = new ArrayList<>();
        assertEquals(ans, solution.letterCombinations(digits));
    }

    @Test
    void letterCombinations3() {
        String digits = "2";
        List<String> ans = Arrays.asList("a", "b", "c");
        assertEquals(ans, solution.letterCombinations(digits));
    }
}