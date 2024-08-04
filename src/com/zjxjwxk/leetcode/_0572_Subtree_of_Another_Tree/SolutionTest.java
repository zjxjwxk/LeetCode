package com.zjxjwxk.leetcode._0572_Subtree_of_Another_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isSubtree() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 4, 5, 1, 2});
        TreeNode subRoot = DSFactory.newTree(new Integer[]{4, 1, 2});
        assertTrue(solution.isSubtree(root, subRoot));
    }

    @Test
    void isSubtree2() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 4, 5, 1, 2, null, null, null, null, 0});
        TreeNode subRoot = DSFactory.newTree(new Integer[]{4, 1, 2});
        assertFalse(solution.isSubtree(root, subRoot));
    }
}