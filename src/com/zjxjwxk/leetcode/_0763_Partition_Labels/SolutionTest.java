package com.zjxjwxk.leetcode._0763_Partition_Labels;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void partitionLabels() {
        String S = "ababcbacadefegdehijhklij";
        List<Integer> ans = Arrays.asList(9, 7, 8);
        assertEquals(ans, solution.partitionLabels(S));
    }
}