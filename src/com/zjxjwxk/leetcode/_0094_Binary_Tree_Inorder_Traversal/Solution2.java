package com.zjxjwxk.leetcode._0094_Binary_Tree_Inorder_Traversal;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归
 * @author Xinkang Wu
 * @date 2021/3/28 15:50
 */
public class Solution2 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    private void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
}
