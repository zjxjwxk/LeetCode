package com.zjxjwxk.leetcode._0098_Validate_Binary_Search_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * @author Xinkang Wu
 * @date 2024/3/9 22:06
 */
public class Solution {

    private TreeNode preNode;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (preNode != null && root.val <= preNode.val) {
            return false;
        }
        preNode = root;
        return isValidBST(root.right);
    }
}
