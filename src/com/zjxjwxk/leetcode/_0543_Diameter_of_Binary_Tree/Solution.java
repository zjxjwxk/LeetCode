package com.zjxjwxk.leetcode._0543_Diameter_of_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 后续遍历
 *
 * @author Xinkang Wu
 * @date 2025/7/15 21:42
 */
public class Solution {

    private int maxLen;

    public int diameterOfBinaryTree(TreeNode root) {
        this.maxLen = 0;
        maxDepth(root);
        return this.maxLen;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        this.maxLen = Math.max(this.maxLen, leftMaxDepth + rightMaxDepth);
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}
