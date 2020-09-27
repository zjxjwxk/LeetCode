package com.zjxjwxk.leetcode._0235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

/**
 * @author zjxjwxk
 * @date 2020/9/27 7:49 下午
 */
public class Solution {

    private TreeNode commonAncestor;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int rootVal = root.val, pVal = p.val, qVal = q.val;
        if (pVal < rootVal && qVal < rootVal) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (pVal > rootVal && qVal > rootVal) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    /**
     * Definition for a binary tree node.
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
