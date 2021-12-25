package com.zjxjwxk.leetcode._1609_Even_Odd_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/12/25 23:11
 */
public class Solution {

    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean even = false;
        while (!queue.isEmpty()) {
            even = !even;
            int size = queue.size();
            int pre = -1;
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                if (even && ((node.val & 1) == 0 || i > 0 && node.val <= pre)
                        || (!even && (((node.val & 1) == 1) || i > 0 && node.val >= pre))) {
                    return false;
                }
                pre = node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return true;
    }
}
