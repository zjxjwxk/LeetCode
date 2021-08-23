package com.zjxjwxk.leetcode._1104_Path_In_Zigzag_Labelled_Binary_Tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pathInZigZagTree1() {
        int label = 14;
        List<Integer> ans = Arrays.asList(1, 3, 4, 14);
        assertEquals(ans, solution.pathInZigZagTree(label));
    }

    @Test
    void pathInZigZagTree2() {
        int label = 26;
        List<Integer> ans = Arrays.asList(1, 2, 6, 10, 26);
        assertEquals(ans, solution.pathInZigZagTree(label));
    }
}