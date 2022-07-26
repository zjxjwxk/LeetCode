package com.zjxjwxk.leetcode._0450_Delete_Node_in_a_BST;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void deleteNode1() {
        TreeNode root = DSFactory.newTree(new Integer[]{5, 3, 6, 2, 4, null, 7});
        int key = 3;
        TreeNode ans = DSFactory.newTree(new Integer[]{5, 4, 6, 2, null, null, 7});
        assertEquals(ans, solution.deleteNode(root, key));
    }

    @Test
    void deleteNode2() {
        TreeNode root = DSFactory.newTree(new Integer[]{5, 3, 6, 2, 4, null, 7});
        int key = 7;
        TreeNode ans = DSFactory.newTree(new Integer[]{5, 3, 6, 2, 4});
        assertEquals(ans, solution.deleteNode(root, key));
    }
}