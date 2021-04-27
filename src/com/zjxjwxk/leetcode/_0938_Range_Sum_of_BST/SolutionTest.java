package com.zjxjwxk.leetcode._0938_Range_Sum_of_BST;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rangeSumBST1() {
        TreeNode root = DSFactory.newTree(new Integer[]{10, 5, 15, 3, 7, null, 18});
        int low = 7, high = 15;
        int ans = 32;
        assertEquals(ans, solution.rangeSumBST(root, low, high));
    }

    @Test
    void rangeSumBST2() {
        TreeNode root = DSFactory.newTree(new Integer[]{10, 5, 15, 3, 7, 13, 18, 1, null, 6});
        int low = 6, high = 10;
        int ans = 23;
        assertEquals(ans, solution.rangeSumBST(root, low, high));
    }
}