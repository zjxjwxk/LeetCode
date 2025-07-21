package com.zjxjwxk.leetcode._0114_Flatten_Binary_Tree_to_Linked_List;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 迭代
 *
 * @author Xinkang Wu
 * @date 2025/7/21 14:50
 */
public class Solution2 {

    public void flatten(TreeNode root) {
        TreeNode cur = root, left, last;
        while (cur != null) {
            if (cur.left != null) {
                left = cur.left;
                last = left;
                while (last.right != null) {
                    last = last.right;
                }
                last.right = cur.right;
                cur.right = left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }
}
