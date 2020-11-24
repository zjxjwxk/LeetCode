package com.zjxjwxk.leetcode._0222_Count_Complete_Tree_Nodes;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 二分查找+位运算
 * @author Xinkang Wu
 * @date 2020/11/24 14:56
 */
public class Solution {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode p = root;
        int height = 0;
        while (p != null) {
            ++height;
            p = p.left;
        }
        int left = 1 << (height - 1), right = (1 << height) - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (exist(root, mid, height)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    private boolean exist(TreeNode root, int index, int height) {
        for (int pos = height - 2; pos >= 0; --pos) {
            if (((index >> pos) & 1) == 0) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root != null;
    }
}
