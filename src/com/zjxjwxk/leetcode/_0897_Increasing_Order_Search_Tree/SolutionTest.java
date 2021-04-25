package com.zjxjwxk.leetcode._0897_Increasing_Order_Search_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void increasingBST1() {
        TreeNode root = DSFactory.newTree(new Integer[]{5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9});
        TreeNode ans = DSFactory.newTree(new Integer[]{1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9});
        assertEquals(ans, solution.increasingBST(root));
    }

    @Test
    void increasingBST2() {
        TreeNode root = DSFactory.newTree(new Integer[]{5, 1, 7});
        TreeNode ans = DSFactory.newTree(new Integer[]{1, null, 5, null, 7});
        assertEquals(ans, solution.increasingBST(root));
    }
}