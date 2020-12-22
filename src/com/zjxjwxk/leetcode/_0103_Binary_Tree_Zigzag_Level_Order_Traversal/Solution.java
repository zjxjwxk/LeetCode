package com.zjxjwxk.leetcode._0103_Binary_Tree_Zigzag_Level_Order_Traversal;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.*;

/**
 * 层序遍历+双端队列
 * @author Xinkang Wu
 * @date 2020/12/22 10:20
 */
public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isLeftToRight = true;
        while (!queue.isEmpty()) {
            Deque<Integer> levelQueue = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                if (isLeftToRight) {
                    levelQueue.offerLast(node.val);
                } else {
                    levelQueue.offerFirst(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(new LinkedList<>(levelQueue));
            isLeftToRight = !isLeftToRight;
        }
        return ans;
    }
}
