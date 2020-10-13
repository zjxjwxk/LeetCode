package com.zjxjwxk.leetcode._0077_Combinations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void combine() {
        int n = 4, k = 2;
        int[][] ans = {
                {1, 2},
                {1, 3},
                {1, 4},
                {2, 3},
                {2, 4},
                {3, 4}
        };
        List<List<Integer>> resultList = solution.combine(n, k);
        int[][] result = new int[resultList.size()][k];
        for (int i = 0; i < result.length; ++i) {
            for (int j = 0; j < k; ++j) {
                result[i][j] = resultList.get(i).get(j);
            }
        }
        assertArrayEquals(ans, result);
    }
}