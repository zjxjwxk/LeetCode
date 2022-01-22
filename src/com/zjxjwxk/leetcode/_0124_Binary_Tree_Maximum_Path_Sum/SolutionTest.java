package com.zjxjwxk.leetcode._0124_Binary_Tree_Maximum_Path_Sum;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxPathSum1() {
        TreeNode root = DSFactory.newTree(new Integer[]{1, 2, 3});
        int ans = 6;
        assertEquals(ans, solution.maxPathSum(root));
    }

    @Test
    void maxPathSum2() {
        TreeNode root = DSFactory.newTree(new Integer[]{-10, 9, 20, null, null, 15, 7});
        int ans = 42;
        assertEquals(ans, solution.maxPathSum(root));
    }

    @Test
    void maxPathSum3() {
        TreeNode root = DSFactory.newTree(new Integer[]{-2, 1});
        int ans = 1;
        assertEquals(ans, solution.maxPathSum(root));
    }

    @Test
    void maxPathSum4() {
        TreeNode root = DSFactory.newTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});
        int ans = 48;
        assertEquals(ans, solution.maxPathSum(root));
    }
}