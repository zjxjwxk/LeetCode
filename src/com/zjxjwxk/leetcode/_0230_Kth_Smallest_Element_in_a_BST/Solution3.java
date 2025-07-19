package com.zjxjwxk.leetcode._0230_Kth_Smallest_Element_in_a_BST;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 中序遍历（迭代）
 *
 * @author Xinkang Wu
 * @date 2025/7/19 16:15
 */
public class Solution3 {

    public int kthSmallest(TreeNode root, int k) {
        int count = 0;
        Deque<TreeNode> stack = new LinkedList<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ++count;
            if (count == k) {
                return root.val;
            }
            root = root.right;
        }
        return -1;
    }
}
