package com.zjxjwxk.leetcode._0297_Serialize_and_Deserialize_Binary_Tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zjxjwxk
 * @date 2020/10/12 3:40 下午
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean hasNext = true;
        while (!queue.isEmpty() && hasNext) {
            hasNext = false;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                if (sb.length() > 0) {
                    sb.append(',');
                }
                if (node == null) {
                    sb.append("null");
                } else {
                    sb.append(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                    if (node.left != null || node.right != null) {
                        hasNext = true;
                    }
                }
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        if (nodes.length == 0 || "null".equals(nodes[0])) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Deque<TreeNode> queue = new LinkedList();
        queue.offer(root);
        int index = 1;
        while (!queue.isEmpty() && index < nodes.length) {
            int size = queue.size() * 2, right = index + size;
            for (; index < right; index += 2) {
                TreeNode node = queue.poll();
                String leftStr = nodes[index], rightStr = nodes[index + 1];
                node.left = "null".equals(leftStr) ? null : new TreeNode(Integer.parseInt(leftStr));
                node.right = "null".equals(rightStr) ? null : new TreeNode(Integer.parseInt(rightStr));
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }

    /**
     * Definition for a binary tree node.
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
