package com.zjxjwxk.leetcode._0110_Balanced_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 后序遍历+剪枝
 *
 * @author Xinkang Wu
 * @date 2026/1/8 22:46
 */
public class Solution2 {

    public boolean isBalanced(TreeNode root) {
        return level(root) != -1;
    }

    private int level(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLevel, rightLevel;
        if ((leftLevel = level(root.left)) == -1 || (rightLevel = level(root.right)) == -1) {
            return -1;
        }
        if (Math.abs(leftLevel - rightLevel) > 1) {
            return -1;
        }
        return 1 + Math.max(leftLevel, rightLevel);
    }
}
