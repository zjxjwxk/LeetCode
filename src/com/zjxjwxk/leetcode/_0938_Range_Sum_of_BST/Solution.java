package com.zjxjwxk.leetcode._0938_Range_Sum_of_BST;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2021/4/27 23:34
 */
public class Solution {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
