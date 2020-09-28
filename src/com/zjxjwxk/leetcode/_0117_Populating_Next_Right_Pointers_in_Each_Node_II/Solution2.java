package com.zjxjwxk.leetcode._0117_Populating_Next_Right_Pointers_in_Each_Node_II;

/**
 * 利用next指针BFS
 * @author zjxjwxk
 * @date 2020/9/28 12:50 下午
 */
class Solution2 {

    private Node nextHead, nextPre;

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node nowHead = root;
        while (nowHead != null) {
            connectNode(nowHead.left);
            connectNode(nowHead.right);
            nowHead = nowHead.next;
            if (nowHead == null) {
                nowHead = nextHead;
                nextHead = null;
                nextPre = null;
            }
        }
        return root;
    }

    private void connectNode(Node node) {
        if (node != null) {
            if (nextHead == null) {
                nextHead = node;
            }
            if (nextPre != null) {
                nextPre.next = node;
            }
            nextPre = node;
        }
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
    }
}
