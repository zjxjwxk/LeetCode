package com.zjxjwxk.leetcode._0212_Word_Search_II;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 回溯 + 字典树
 * @author Xinkang Wu
 * @date 2021/9/16 14:33
 */
public class Solution2 {

    private static final int[][] DIRECTION = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        Set<String> ans = new HashSet<>();
        int m = board.length, n = board[0].length;
        for (int x = 0; x < m; ++x) {
            for (int y = 0; y < n; ++y) {
                dfs(board, x, y, trie, ans);
            }
        }
        return new ArrayList<>(ans);
    }

    private void dfs(char[][] board, int x, int y, Trie cur, Set<String> ans) {
        char ch = board[x][y];
        if (ch == '#' || cur.children[ch - 'a'] == null) {
            return;
        }
        Trie next = cur.children[ch - 'a'];
        if (next.word != null) {
            ans.add(next.word);
            // 已找到的单词将其末尾字符Trie结点中的word设为null
            next.word = null;
        }
        board[x][y] = '#';
        for (int[] dir : DIRECTION) {
            int nextX = x + dir[0], nextY = y + dir[1];
            if (nextX >= 0 && nextX < board.length && nextY >= 0 && nextY < board[0].length) {
                dfs(board, nextX, nextY, next, ans);
            }
        }
        board[x][y] = ch;
        // 删除已搜索过的没有children的Trie结点
        boolean isEmpty = true;
        for (Trie child : next.children) {
            if (child != null) {
                isEmpty = false;
                break;
            }
        }
        if (isEmpty) {
            cur.children[ch - 'a'] = null;
        }
    }

    static class Trie {
        public String word;
        public Trie[] children;

        public Trie() {
            this.children = new Trie[26];
        }

        public void insert(String word) {
            Trie cur = this;
            for (int i = 0; i < word.length(); ++i) {
                char ch = word.charAt(i);
                if (cur.children[ch - 'a'] == null) {
                    cur.children[ch - 'a'] = new Trie();
                }
                cur = cur.children[ch - 'a'];
            }
            cur.word = word;
        }
    }
}
