package com.zjxjwxk.leetcode._0124_Binary_Tree_Maximum_Path_Sum;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 递归
 * @author Xinkang Wu
 * @date 2022/1/22 11:38
 */
public class Solution {

    private int ans;

    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        maxPathSumWithNode(root);
        return ans;
    }

    private int maxPathSumWithNode(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = maxPathSumWithNode(root.left);
        int rightMax = maxPathSumWithNode(root.right);
        int curMax = root.val + Math.max(leftMax, 0) + Math.max(rightMax, 0);
        ans = Math.max(ans, curMax);
        return root.val + Math.max(Math.max(leftMax, 0), Math.max(rightMax, 0));
    }
}
