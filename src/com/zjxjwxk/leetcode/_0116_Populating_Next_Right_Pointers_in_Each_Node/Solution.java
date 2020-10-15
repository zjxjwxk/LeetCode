package com.zjxjwxk.leetcode._0116_Populating_Next_Right_Pointers_in_Each_Node;

/**
 * @author zjxjwxk
 * @date 2020/10/15 10:04 上午
 */
public class Solution {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node head = root, nextHead = null, nextPre = null;
        while (head.left != null) {
            if (nextHead == null) {
                nextHead = head.left;
            } else {
                nextPre.next = head.left;
            }
            head.left.next = head.right;
            nextPre = head.right;
            head = head.next;
            if (head == null) {
                head = nextHead;
                nextHead = null;
                nextPre = null;
            }
        }
        return root;
    }

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
