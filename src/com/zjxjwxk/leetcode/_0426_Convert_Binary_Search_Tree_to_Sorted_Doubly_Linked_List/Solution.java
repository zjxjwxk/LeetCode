package com.zjxjwxk.leetcode._0426_Convert_Binary_Search_Tree_to_Sorted_Doubly_Linked_List;

/**
 * @author zjxjwxk
 * @date 2020/10/12 1:39 下午
 */
public class Solution {

    private Node head, pre;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        inorder(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (head == null) {
            head = root;
        }
        if (pre != null) {
            pre.right = root;
            root.left = pre;
        }
        pre = root;
        inorder(root.right);
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}
