package com.zjxjwxk.leetcode._LCR_143_Is_Sub_Structure_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 双重递归
 *
 * @author Xinkang Wu
 * @date 2026/1/10 14:17
 */
public class Solution {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return isSame(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isSame(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        return A.val == B.val && isSame(A.left, B.left) && isSame(A.right, B.right);
    }
}
