package com.zjxjwxk.leetcode._0783_Minimum_Distance_Between_BST_Nodes;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 中序遍历
 * @author Xinkang Wu
 * @date 2021/4/13 15:42
 */
public class Solution {

    private int preVal;
    private int minDiff;

    public int minDiffInBST(TreeNode root) {
        this.preVal = -1;
        this.minDiff = Integer.MAX_VALUE;
        inorder(root);
        return this.minDiff;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (this.preVal != -1) {
            this.minDiff = Math.min(minDiff, root.val - preVal);
        }
        this.preVal = root.val;
        inorder(root.right);
    }
}
