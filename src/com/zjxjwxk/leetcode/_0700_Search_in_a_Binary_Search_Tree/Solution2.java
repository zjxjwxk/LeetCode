package com.zjxjwxk.leetcode._0700_Search_in_a_Binary_Search_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 迭代
 * @author Xinkang Wu
 * @date 2021/11/26 12:32
 */
public class Solution2 {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (val < root.val) {
                root = root.left;
            } else if (val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}
