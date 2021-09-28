package com.zjxjwxk.leetcode._0437_Path_Sum_III;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/9/28 16:17
 */
public class Solution {

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        return dfs(root, targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
    }

    private int dfs(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        return (root.val == targetSum ? 1 : 0)
                + dfs(root.left, targetSum - root.val)
                + dfs(root.right, targetSum - root.val);
    }
}
