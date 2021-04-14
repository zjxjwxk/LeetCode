package com.zjxjwxk.leetcode._0208_Implement_Trie__Prefix_Tree__;

import java.util.Map;
import java.util.TreeMap;

/**
 * Map实现
 * @author zjxjwxk
 */
public class Trie {

    static class Node {
        boolean isWord;
        Map<Character, Node> childMap;

        public Node() {
            this.isWord = false;
            this.childMap = new TreeMap<>();
        }
    }

    private final Node root;

    /** Initialize your data structure here. */
    public Trie() {
        this.root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node cur = root;
        for (char ch : word.toCharArray()) {
            cur.childMap.putIfAbsent(ch, new Node());
            cur = cur.childMap.get(ch);
        }
        cur.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node cur = root;
        for (char ch : word.toCharArray()) {
            Node next = cur.childMap.get(ch);
            if (next == null) {
                return false;
            }
            cur = next;
        }
        return cur.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node cur = root;
        for (char ch : prefix.toCharArray()) {
            Node next = cur.childMap.get(ch);
            if (next == null) {
                return false;
            }
            cur = next;
        }
        return true;
    }
}