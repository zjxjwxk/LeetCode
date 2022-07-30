package com.zjxjwxk.leetcode._0110_Balanced_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * @author Xinkang Wu
 * @date 2022/7/30 02:46
 */
public class Solution {

    public boolean isBalanced(TreeNode root) {
        return postorder(root) != -1;
    }

    private int postorder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int h1 = postorder(root.left);
        int h2 = postorder(root.right);
        if (h1 == -1 || h2 == -1 || Math.abs(h1 - h2) > 1) {
            return -1;
        }
        return Math.max(h1, h2) + 1;
    }
}
