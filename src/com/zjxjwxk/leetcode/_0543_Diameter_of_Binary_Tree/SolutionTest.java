package com.zjxjwxk.leetcode._0543_Diameter_of_Binary_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void diameterOfBinaryTree() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3, 4, 5});
        int ans = 3;
        assertEquals(ans, solution.diameterOfBinaryTree(root));
    }

    @Test
    void diameterOfBinaryTree2() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2});
        int ans = 1;
        assertEquals(ans, solution.diameterOfBinaryTree(root));
    }
}