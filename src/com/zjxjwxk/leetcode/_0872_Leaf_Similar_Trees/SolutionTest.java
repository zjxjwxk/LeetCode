package com.zjxjwxk.leetcode._0872_Leaf_Similar_Trees;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void leafSimilar1() {
        TreeNode root1 = DSFactory.newTree(new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4});
        TreeNode root2 = DSFactory.newTree(new Integer[]{3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8});
        assertTrue(solution.leafSimilar(root1, root2));
    }

    @Test
    void leafSimilar2() {
        TreeNode root1 = DSFactory.newTree(new Integer[]{1});
        TreeNode root2 = DSFactory.newTree(new Integer[]{1});
        assertTrue(solution.leafSimilar(root1, root2));
    }

    @Test
    void leafSimilar3() {
        TreeNode root1 = DSFactory.newTree(new Integer[]{1});
        TreeNode root2 = DSFactory.newTree(new Integer[]{2});
        assertFalse(solution.leafSimilar(root1, root2));
    }

    @Test
    void leafSimilar4() {
        TreeNode root1 = DSFactory.newTree(new Integer[]{1, 2});
        TreeNode root2 = DSFactory.newTree(new Integer[]{2, 2});
        assertTrue(solution.leafSimilar(root1, root2));
    }

    @Test
    void leafSimilar5() {
        TreeNode root1 = DSFactory.newTree(new Integer[]{1, 2, 3});
        TreeNode root2 = DSFactory.newTree(new Integer[]{1, 3, 2});
        assertFalse(solution.leafSimilar(root1, root2));
    }
}