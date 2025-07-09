package com.zjxjwxk.leetcode._0146_LRU_Cache;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap+双向链表
 *
 * @author Xinkang Wu
 * @date 2025/7/9 21:41
 */
public class LRUCache4 {

    class Node {
        Node prev;
        Node next;
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> nodeMap;
    private Node head;
    private Node tail;

    public LRUCache4(int capacity) {
        this.capacity = capacity;
        this.nodeMap = new HashMap<>();
    }

    public int get(int key) {
        Node node = this.nodeMap.get(key);
        if (node == null) {
            return -1;
        }
        addToTail(remove(node));
        return node.value;
    }

    public void put(int key, int value) {
        if (this.nodeMap.size() == this.capacity) {
            this.nodeMap.remove(this.head.key);
            remove(this.head);
        }
        Node node = this.nodeMap.get(key);
        if (node == null) {
            node = new Node(key, value);
            this.nodeMap.put(key, node);
            addToTail(node);
        } else {
            node.value = value;
            addToTail(remove(node));
        }
    }

    private Node remove(Node node) {
        Node prev = node.prev, next = node.next;
        if (this.head == node) {
            this.head = next;
        }
        if (this.tail == node) {
            this.tail = prev;
        }
        if (prev != null) {
            prev.next = next;
        }
        if (next != null) {
            next.prev = prev;
        }
        node.next = null;
        node.prev = null;
        return node;
    }

    private void addToTail(Node node) {
        if (this.tail == node) {
            return;
        }
        if (this.tail == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.next = node;
        node.prev = this.tail;
        node.next = null;
        this.tail = node;
    }
}
