package com.zjxjwxk.leetcode._0671_Second_Minimum_Node_In_a_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/8/11 21:10
 */
public class Solution {

    private int rootVal;
    private int minVal;

    public int findSecondMinimumValue(TreeNode root) {
        rootVal = root.val;
        minVal = -1;
        dfs(root);
        return minVal;
    }

    private void dfs(TreeNode cur) {
        if (cur == null) {
            return;
        }
        if (cur.val > rootVal) {
            if (minVal == -1) {
                minVal = cur.val;
            } else {
                minVal = Math.min(minVal, cur.val);
            }
        } else {
            dfs(cur.left);
            dfs(cur.right);
        }
    }
}
