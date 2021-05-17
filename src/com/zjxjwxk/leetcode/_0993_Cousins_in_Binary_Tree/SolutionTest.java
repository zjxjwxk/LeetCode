package com.zjxjwxk.leetcode._0993_Cousins_in_Binary_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isCousins1() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3, 4});
        int x = 4, y = 3;
        assertFalse(solution.isCousins(root, x, y));
    }

    @Test
    void isCousins2() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3, null, 4, null, 5});
        int x = 5, y = 4;
        assertTrue(solution.isCousins(root, x, y));
    }

    @Test
    void isCousins3() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3, null, 4});
        int x = 2, y = 3;
        assertFalse(solution.isCousins(root, x, y));
    }
}