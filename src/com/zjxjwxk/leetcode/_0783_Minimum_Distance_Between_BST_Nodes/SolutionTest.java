package com.zjxjwxk.leetcode._0783_Minimum_Distance_Between_BST_Nodes;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minDiffInBST1() {
        TreeNode root = DSFactory.newTree(new Integer[]{4, 2, 6, 1, 3});
        int ans = 1;
        assertEquals(ans, solution.minDiffInBST(root));
    }

    @Test
    void minDiffInBST2() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 0, 48, null, null, 12, 49});
        int ans = 1;
        assertEquals(ans, solution.minDiffInBST(root));
    }
}