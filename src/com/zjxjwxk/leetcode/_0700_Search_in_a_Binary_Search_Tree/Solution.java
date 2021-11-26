package com.zjxjwxk.leetcode._0700_Search_in_a_Binary_Search_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 递归
 * @author Xinkang Wu
 * @date 2021/11/26 12:32
 */
public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        } else if (val > root.val) {
            return searchBST(root.right, val);
        } else {
            return root;
        }
    }
}
