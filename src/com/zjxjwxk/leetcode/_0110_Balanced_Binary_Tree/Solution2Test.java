package com.zjxjwxk.leetcode._0110_Balanced_Binary_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void isBalanced1() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertTrue(solution2.isBalanced(root));
    }

    @Test
    void isBalanced2() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4});
        assertFalse(solution2.isBalanced(root));
    }

    @Test
    void isBalanced3() {
        TreeNode root = DSFactory.newTree(new Integer[]{});
        assertTrue(solution2.isBalanced(root));
    }
}