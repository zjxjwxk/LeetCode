package com.zjxjwxk.leetcode._0677_Map_Sum_Pairs;

/**
 * 字典树+前缀和
 * @author Xinkang Wu
 * @date 2021/11/14 00:09
 */
public class MapSum2 {

    private final Trie trie;

    public MapSum2() {
        trie = new Trie();
    }

    public void insert(String key, int val) {
        trie.insert(trie, key, 0, val);
    }

    public int sum(String prefix) {
        return trie.sum(prefix);
    }

    static class Trie {

        public Trie[] children;
        public int val;
        public int prefixSum;

        public Trie() {
            children = new Trie[26];
        }

        public int insert(Trie cur, String key, int index, int val) {
            int chIndex = key.charAt(index) - 'a';
            if (cur.children[chIndex] == null) {
                cur.children[chIndex] = new Trie();
            }
            cur.children[chIndex].prefixSum += val;
            if (index == key.length() - 1) {
                int oldVal = cur.children[chIndex].val;
                cur.children[chIndex].val = val;
                cur.children[chIndex].prefixSum -= oldVal;
                return oldVal;
            }
            int oldVal = insert(cur.children[chIndex], key, index + 1, val);
            cur.children[chIndex].prefixSum -= oldVal;
            return oldVal;
        }

        public int sum(String prefix) {
            Trie cur = this;
            for (char ch : prefix.toCharArray()) {
                cur = cur.children[ch - 'a'];
                if (cur == null) {
                    return 0;
                }
            }
            return cur.prefixSum;
        }
    }
}
