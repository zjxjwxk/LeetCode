package com.zjxjwxk.leetcode._0110_Balanced_Binary_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isBalanced1() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertTrue(solution.isBalanced(root));
    }

    @Test
    void isBalanced2() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4});
        assertFalse(solution.isBalanced(root));
    }

    @Test
    void isBalanced3() {
        TreeNode root = DSFactory.newTree(new Integer[]{});
        assertTrue(solution.isBalanced(root));
    }
}