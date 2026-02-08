package com.zjxjwxk.leetcode._0114_Flatten_Binary_Tree_to_Linked_List;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 递归
 *
 * @author Xinkang Wu
 * @date 2026/2/8 12:49
 */
public class Solution3 {

    private TreeNode last;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        buildFlatten(root);
    }

    private TreeNode buildFlatten(TreeNode root) {
        if (root == null) {
            return null;
        }
        last = root;
        TreeNode left = buildFlatten(root.left);
        TreeNode leftLast = last;
        TreeNode right = buildFlatten(root.right);
        root.left = null;
        root.right = left;
        leftLast.right = right;
        return root;
    }
}
