package com.zjxjwxk.leetcode._2961_Double_Modular_Exponentiation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getGoodIndices() {
        int[][] variables = {{2, 3, 3, 10}, {3, 3, 3, 1}, {6, 1, 1, 4}};
        int target = 2;
        List<Integer> ans = Arrays.asList(0, 2);
        assertEquals(ans, solution.getGoodIndices(variables, target));
    }

    @Test
    void getGoodIndices2() {
        int[][] variables = {{39, 3, 1000, 1000}};
        int target = 17;
        List<Integer> ans = Collections.emptyList();
        assertEquals(ans, solution.getGoodIndices(variables, target));
    }
}