package com.zjxjwxk.leetcode._0146_LRU_Cache;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap+双向链表
 * @author Xinkang Wu
 * @date 2022/1/24 02:24
 */
public class LRUCache2 {

    private final int capacity;
    private int size;
    private final Map<Integer, Node> map;
    private final Node dummyHead;
    private final Node dummyTail;

    public LRUCache2(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        dummyHead = new Node();
        dummyTail = new Node();
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        removeNode(node);
        insertTail(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            if (size == capacity) {
                Node removed = removeHead();
                map.remove(removed.key);
                --size;
            }
            node = new Node(key, value);
            map.put(key, node);
            ++size;
        } else {
            node.value = value;
            removeNode(node);
        }
        insertTail(node);
    }

    private void insertTail(Node node) {
        dummyTail.prev.next = node;
        node.prev = dummyTail.prev;
        node.next = dummyTail;
        dummyTail.prev = node;
    }

    private Node removeHead() {
        Node node = dummyHead.next;
        removeNode(node);
        return node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    static class Node {
        Node prev;
        Node next;
        int key;
        int value;

        public Node() {

        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
