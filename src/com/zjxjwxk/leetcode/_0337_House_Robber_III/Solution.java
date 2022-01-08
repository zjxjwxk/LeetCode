package com.zjxjwxk.leetcode._0337_House_Robber_III;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2022/1/8 16:27
 */
public class Solution {

    public int rob(TreeNode root) {
        int[] dp = dfs(root);
        return Math.max(dp[0], dp[1]);
    }

    private int[] dfs(TreeNode cur) {
        if (cur == null) {
            return new int[2];
        }
        int[] dp = new int[2];
        int[] dpLeft = dfs(cur.left);
        int[] dpRight = dfs(cur.right);
        dp[0] = Math.max(dpLeft[0], dpLeft[1]) + Math.max(dpRight[0], dpRight[1]);
        dp[1] = dpLeft[0] + dpRight[0] + cur.val;
        return dp;
    }
}
