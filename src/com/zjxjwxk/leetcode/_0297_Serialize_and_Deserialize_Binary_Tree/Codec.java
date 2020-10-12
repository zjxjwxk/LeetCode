package com.zjxjwxk.leetcode._0297_Serialize_and_Deserialize_Binary_Tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zjxjwxk
 * @date 2020/10/12 3:40 下午
 */
public class Codec {

    /**
     * Encodes a tree to a single string.
     * @param root Tree root to serialize
     * @return Serialized string
     */
    public String serialize(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        StringBuilder str = new StringBuilder();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (str.length() != 0) {
                str.append(",");
            }
            if (node == null) {
                str.append(Integer.MAX_VALUE);
            } else {
                str.append(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                } else {
                    queue.offer(null);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                } else {
                    queue.offer(null);
                }
            }
        }
        return str.toString();
    }

    /**
     * Decodes your encoded data to tree.
     * @param data String to deserialize
     * @return Tree root
     */
    public TreeNode deserialize(String data) {
        String[] strArr = data.split(",");
        int len = strArr.length, index = 1;
        int[] valArr = new int[len];
        for (int i = 0; i < len; ++i) {
            valArr[i] = Integer.parseInt(strArr[i]);
        }
        if (valArr[0] == Integer.MAX_VALUE) {
            return null;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        TreeNode head = new TreeNode(valArr[0]);
        queue.offer(head);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                if (valArr[index] != Integer.MAX_VALUE) {
                    node.left = new TreeNode(valArr[index]);
                    queue.offer(node.left);
                } else {
                    node.left = null;
                }
                ++index;
                if (valArr[index] != Integer.MAX_VALUE) {
                    node.right = new TreeNode(valArr[index]);
                    queue.offer(node.right);
                } else {
                    node.right = null;
                }
                ++index;
            }
        }
        return head;
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
