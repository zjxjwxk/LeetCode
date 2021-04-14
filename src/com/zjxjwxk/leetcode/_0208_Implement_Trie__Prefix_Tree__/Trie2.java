package com.zjxjwxk.leetcode._0208_Implement_Trie__Prefix_Tree__;

/**
 * 哈希表实现
 * @author Xinkang Wu
 * @date 2021/4/15 00:25
 */
public class Trie2 {

    public boolean isWord;
    public Trie2[] childArr;

    /** Initialize your data structure here. */
    public Trie2() {
        this.isWord = false;
        this.childArr = new Trie2[26];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie2 cur = this;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            Trie2 node = cur.childArr[index];
            if (node == null) {
                cur.childArr[index] = new Trie2();
            }
            cur = cur.childArr[index];
        }
        cur.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie2 node = searchPrefix(word);
        return node != null && node.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie2 searchPrefix(String prefix) {
        Trie2 cur = this;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            Trie2 node = cur.childArr[index];
            if (node == null) {
                return null;
            }
            cur = cur.childArr[index];
        }
        return cur;
    }
}
