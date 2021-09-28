package com.zjxjwxk.leetcode._0437_Path_Sum_III;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void pathSum1() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                10, 5, -3, 3, 2, null, 11, 3, -2, null, 1
        });
        int targetSum = 8;
        int ans = 3;
        assertEquals(ans, solution2.pathSum(root, targetSum));
    }

    @Test
    void pathSum2() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1
        });
        int targetSum = 22;
        int ans = 3;
        assertEquals(ans, solution2.pathSum(root, targetSum));
    }

    @Test
    void pathSum3() {
        TreeNode root = DSFactory.newTree(new Integer[]{
                1, -2, -3
        });
        int targetSum = -1;
        int ans = 1;
        assertEquals(ans, solution2.pathSum(root, targetSum));
    }
}