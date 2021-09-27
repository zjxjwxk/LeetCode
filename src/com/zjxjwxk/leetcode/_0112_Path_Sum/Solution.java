package com.zjxjwxk.leetcode._0112_Path_Sum;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/9/28 00:28
 */
public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }
}
