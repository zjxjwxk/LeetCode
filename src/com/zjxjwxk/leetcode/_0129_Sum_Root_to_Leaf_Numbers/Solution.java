package com.zjxjwxk.leetcode._0129_Sum_Root_to_Leaf_Numbers;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * @author Xinkang Wu
 * @date 2020/10/29 8:14 上午
 */
public class Solution {

    private int ans = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    private void dfs(TreeNode root, int num) {
        if (root == null) {
            return;
        }
        num = num * 10 + root.val;
        if (root.left == null && root.right == null) {
            ans += num;
        } else {
            dfs(root.left, num);
            dfs(root.right, num);
        }
    }
}
