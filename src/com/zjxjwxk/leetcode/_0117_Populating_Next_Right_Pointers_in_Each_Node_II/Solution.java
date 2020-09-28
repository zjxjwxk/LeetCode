package com.zjxjwxk.leetcode._0117_Populating_Next_Right_Pointers_in_Each_Node_II;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 利用队列BFS
 * @author zjxjwxk
 * @date 2020/9/28 11:53 上午
 */
public class Solution {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node pre = null;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Node now = queue.poll();
                if (now.left != null) {
                    queue.offer(now.left);
                }
                if (now.right != null) {
                    queue.offer(now.right);
                }
                if (i != 0) {
                    pre.next = now;
                }
                pre = now;
            }
        }
        return root;
    }

    /**
     * Definition for a Node.
     */
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
