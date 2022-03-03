package com.zjxjwxk.leetcode._0236_Lowest_Common_Ancestor_of_a_Binary_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lowestCommonAncestor() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p = root.left, q = root.right;
        int ans = 3;
        assertEquals(ans, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void lowestCommonAncestor2() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p = root.left, q = root.left.right.right;
        int ans = 5;
        assertEquals(ans, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void lowestCommonAncestor3() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2});
        TreeNode p = root, q = root.left;
        int ans = 1;
        assertEquals(ans, solution.lowestCommonAncestor(root, p, q).val);
    }
}