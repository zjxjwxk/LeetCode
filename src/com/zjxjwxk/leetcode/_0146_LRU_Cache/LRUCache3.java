package com.zjxjwxk.leetcode._0146_LRU_Cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xinkang Wu
 * @date 2023/12/22 01:47
 */
public class LRUCache3 {

    static class Node {
        Node pre;
        Node next;
        int key;
        int val;

        public Node(int key, int value) {
            this.key = key;
            this.val = value;
        }
    }

    private Node head;
    private Node tail;
    private Map<Integer, Node> map;
    private int capacity;
    private int size;

    public LRUCache3(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        moveToTail(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            Node newNode = new Node(key, value);
            if (this.size == this.capacity) {
                this.map.put(this.head.key, null);
                poll();
                --this.size;
            }
            this.map.put(newNode.key, newNode);
            offer(newNode);
            ++this.size;
        } else {
            node.val = value;
            moveToTail(node);
        }
    }

    private void poll() {
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            Node newHead = this.head.next;
            newHead.pre = null;
            this.head.next = null;
            this.head = newHead;
        }
    }

    private void offer(Node node) {
        if (this.tail == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.pre = this.tail;
            this.tail = node;
        }
    }

    private void moveToTail(Node node) {
        if (this.head == this.tail || this.tail == node) {
            return;
        }
        if (this.head == node) {
            poll();
            offer(node);
        } else {
            node.pre.next = node.next;
            node.next.pre = node.pre;
            node.next = null;
            offer(node);
        }
    }
}
