package com.zjxjwxk.leetcode._0236_Lowest_Common_Ancestor_of_a_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 递归（后续遍历）
 *
 * @author Xinkang Wu
 * @date 2025/7/24 22:47
 */
public class Solution3 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }
}
