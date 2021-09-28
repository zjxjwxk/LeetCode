package com.zjxjwxk.leetcode._0437_Path_Sum_III;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pathSum1() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                10, 5, -3, 3, 2, null, 11, 3, -2, null, 1
        });
        int targetSum = 8;
        int ans = 3;
        assertEquals(ans, solution.pathSum(root, targetSum));
    }

    @Test
    void pathSum2() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1
        });
        int targetSum = 22;
        int ans = 3;
        assertEquals(ans, solution.pathSum(root, targetSum));
    }
}