package com.zjxjwxk.leetcode._0098_Validate_Binary_Search_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isValidBST1() {
        TreeNode root = DSFactory.newTree(new Integer[]{2, 1, 3});
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void isValidBST2() {
        TreeNode root = DSFactory.newTree(new Integer[]{5, 1, 4, null, null, 3, 6});
        assertFalse(solution.isValidBST(root));
    }
}