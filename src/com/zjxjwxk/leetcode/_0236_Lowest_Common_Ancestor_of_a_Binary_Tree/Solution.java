package com.zjxjwxk.leetcode._0236_Lowest_Common_Ancestor_of_a_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 递归
 * @author Xinkang Wu
 * @date 2022/3/3 20:55
 */
public class Solution {

    private TreeNode commonAncestor;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return commonAncestor;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean leftFound = dfs(root.left, p, q);
        boolean rightFound = dfs(root.right, p, q);
        if (leftFound && rightFound || (root == p || root == q) && (leftFound || rightFound)) {
            commonAncestor = root;
            return true;
        }
        return root == p || root == q || leftFound || rightFound;
    }
}
