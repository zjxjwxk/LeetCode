package com.zjxjwxk.leetcode._0472_Concatenated_Words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 字典树+深度优先搜索（记忆化）
 * @author Xinkang Wu
 * @date 2021/12/30 14:36
 */
public class Solution {

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        Trie root = new Trie();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (String word : words) {
            if (word.length() > 0) {
                boolean[] vis = new boolean[word.length()];
                if (isConcatenatedWord(root, word, 0, vis)) {
                    ans.add(word);
                } else {
                    root.insert(word);
                }
            }
        }
        return ans;
    }

    private boolean isConcatenatedWord(Trie root, String word, int index, boolean[] vis) {
        if (index == word.length()) {
            return true;
        }
        if (vis[index]) {
            return false;
        }
        vis[index] = true;
        Trie cur = root;
        while (index < word.length() && (cur = cur.children[word.charAt(index) - 'a']) != null) {
            if (cur.isWord && isConcatenatedWord(root, word, index + 1, vis)) {
                return true;
            }
            ++index;
        }
        return false;
    }

    static class Trie {
        Trie[] children;
        boolean isWord;

        public Trie() {
            children = new Trie[26];
            isWord = false;
        }

        public void insert(String word) {
            Trie cur = this;
            for (char ch : word.toCharArray()) {
                if (cur.children[ch - 'a'] == null) {
                    cur.children[ch - 'a'] = new Trie();
                }
                cur = cur.children[ch - 'a'];
            }
            cur.isWord = true;
        }
    }
}
