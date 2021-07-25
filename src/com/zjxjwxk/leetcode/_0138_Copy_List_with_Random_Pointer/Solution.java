package com.zjxjwxk.leetcode._0138_Copy_List_with_Random_Pointer;

/**
 * 迭代 + 节点拆分
 * @author zjxjwxk
 * @date 2020/10/9 10:18 下午
 */
public class Solution {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        copyOriginalList(head);
        setRandom(head);
        return getRandomList(head);
    }

    private void copyOriginalList(Node head) {
        while (head != null) {
            Node newNode = new Node(head.val);
            newNode.next = head.next;
            head.next = newNode;
            head = newNode.next;
        }
    }

    private void setRandom(Node head) {
        while (head != null) {
            if (head.random != null) {
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }
    }

    private Node getRandomList(Node head) {
        Node newHead = head.next;
        while (head != null) {
            Node newNode = head.next;
            head.next = newNode.next;
            head = head.next;
            newNode.next = (newNode.next != null) ? newNode.next.next : null;
        }
        return newHead;
    }
}
