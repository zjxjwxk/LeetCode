package com.zjxjwxk.leetcode._0112_Path_Sum;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void hasPathSum1() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1
        });
        int targetSum = 22;
        assertTrue(solution.hasPathSum(root, targetSum));
    }

    @Test
    void hasPathSum2() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                1, 2, 3
        });
        int targetSum = 5;
        assertFalse(solution.hasPathSum(root, targetSum));
    }

    @Test
    void hasPathSum3() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                1, 2
        });
        int targetSum = 0;
        assertFalse(solution.hasPathSum(root, targetSum));
    }

    @Test
    void hasPathSum4() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                1, 2
        });
        int targetSum = 1;
        assertFalse(solution.hasPathSum(root, targetSum));
    }
}