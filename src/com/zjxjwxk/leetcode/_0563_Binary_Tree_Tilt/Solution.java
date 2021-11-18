package com.zjxjwxk.leetcode._0563_Binary_Tree_Tilt;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 后序遍历
 * @author Xinkang Wu
 * @date 2021/11/18 13:49
 */
public class Solution {

    private int ans;

    public int findTilt(TreeNode root) {
        ans = 0;
        postorder(root);
        return ans;
    }

    private int postorder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = postorder(root.left);
        int rightSum = postorder(root.right);
        ans += Math.abs(leftSum - rightSum);
        return root.val + leftSum + rightSum;
    }
}
