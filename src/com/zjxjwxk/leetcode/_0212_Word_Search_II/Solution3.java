package com.zjxjwxk.leetcode._0212_Word_Search_II;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * DFS+Trie
 *
 * @author Xinkang Wu
 * @date 2026/2/21 16:16
 */
public class Solution3 {

    static class Trie {
        public Trie[] children;
        public boolean end;

        public Trie() {
            this.children = new Trie[26];
            this.end = false;
        }
    }

    private static final int[][] DIRECTIONS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public List<String> findWords(char[][] board, String[] words) {
        int m = board.length, n = board[0].length;
        Trie root = new Trie();
        for (String word : words) {
            addWord(root, word);
        }
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                dfs(board, i, j, new StringBuilder(), root.children[board[i][j] - 'a'], wordSet, new HashSet<>());
            }
        }
        return new ArrayList<>(wordSet);
    }

    private void dfs(char[][] board, int i, int j, StringBuilder sb, Trie trie, Set<String> wordSet, Set<Integer> visitedSet) {
        int id = i * board[0].length + j;
        if (trie == null || visitedSet.contains(id)) {
            return;
        }
        visitedSet.add(id);
        sb.append(board[i][j]);
        if (trie.end) {
            wordSet.add(sb.toString());
        }
        for (int[] direction : DIRECTIONS) {
            int nextI = i + direction[0];
            int nextJ = j + direction[1];
            if (nextI >= 0 && nextI < board.length && nextJ >= 0 && nextJ < board[0].length) {
                dfs(board, nextI, nextJ, sb, trie.children[board[nextI][nextJ] - 'a'], wordSet, visitedSet);
            }
        }
        visitedSet.remove(id);
        sb.deleteCharAt(sb.length() - 1);
    }

    private void addWord(Trie root, String word) {
        Trie cur = root;
        for (int i = 0; i < word.length(); ++i) {
            char ch = word.charAt(i);
            int chIndex = ch - 'a';
            if (cur.children[chIndex] == null) {
                cur.children[chIndex] = new Trie();
            }
            cur = cur.children[chIndex];
        }
        cur.end = true;
    }
}
