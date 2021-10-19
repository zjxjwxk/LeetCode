package com.zjxjwxk.leetcode._0211_Design_Add_and_Search_Words_Data_Structure;

/**
 * 字典树
 * @author zjxjwxk
 */
public class WordDictionary {

    private final Trie root;

    public WordDictionary() {
        root = new Trie();
    }

    public void addWord(String word) {
        char[] chArr = word.toCharArray();
        Trie cur = root;
        for (char ch : chArr) {
            Trie[] children = cur.children;
            int childIndex = ch - 'a';
            Trie child = children[childIndex];
            if (child == null) {
                children[childIndex] = new Trie();
            }
            cur = children[childIndex];
        }
        cur.isWord = true;
    }

    public boolean search(String word) {
        char[] chArr = word.toCharArray();
        return dfs(root, chArr, 0);
    }

    private boolean dfs(Trie cur, char[] chArr, int index) {
        if (index == chArr.length) {
            return cur.isWord;
        }
        char ch = chArr[index];
        Trie[] children = cur.children;
        if (ch == '.') {
            for (Trie child : children) {
                if (child != null && dfs(child, chArr, index + 1)) {
                    return true;
                }
            }
        } else {
            Trie child = children[ch - 'a'];
            if (child != null) {
                return dfs(child, chArr, index + 1);
            }
        }
        return false;
    }

    static class Trie {
        public Trie[] children;
        public boolean isWord;

        public Trie() {
            children = new Trie[26];
            isWord = false;
        }
    }
}