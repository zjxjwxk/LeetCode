package com.zjxjwxk.leetcode._0114_Flatten_Binary_Tree_to_Linked_List;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 递归
 *
 * @author Xinkang Wu
 * @date 2025/7/21 14:50
 */
public class Solution {

    public void flatten(TreeNode root) {
        flattenNode(root);
    }

    private TreeNode flattenNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = root.right;
        root.right = flattenNode(root.left);
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = flattenNode(right);
        root.left = null;
        return root;
    }
}
