package com.zjxjwxk.leetcode._0433_Minimum_Genetic_Mutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minMutation() {
        String startGene = "AACCGGTT", endGene = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        int ans = 1;
        assertEquals(ans, solution.minMutation(startGene, endGene, bank));
    }

    @Test
    void minMutation2() {
        String startGene = "AACCGGTT", endGene = "AAACGGTA";
        String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        int ans = 2;
        assertEquals(ans, solution.minMutation(startGene, endGene, bank));
    }

    @Test
    void minMutation3() {
        String startGene = "AAAAACCC", endGene = "AACCCCCC";
        String[] bank = {"AAAACCCC", "AAACCCCC", "AACCCCCC"};
        int ans = 3;
        assertEquals(ans, solution.minMutation(startGene, endGene, bank));
    }
}