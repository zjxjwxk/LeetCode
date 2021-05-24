package com.zjxjwxk.leetcode._1707_Maximum_XOR_With_an_Element_From_Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 离线询问 + 字典树
 * @author Xinkang Wu
 * @date 2021/5/24 21:37
 */
public class Solution {

    public int[] maximizeXor(int[] nums, int[][] queries) {
        Arrays.sort(nums);
        int numQ = queries.length;
        int[][] newQueries = new int[numQ][3];
        for (int i = 0; i < numQ; ++i) {
            newQueries[i][0] = queries[i][0];
            newQueries[i][1] = queries[i][1];
            newQueries[i][2] = i;
        }
        Arrays.sort(newQueries, Comparator.comparingInt(query -> query[1]));
        int[] ans = new int[numQ];
        Trie trie = new Trie();
        int index = 0, len = nums.length;
        for (int[] query : newQueries) {
            int x = query[0], m = query[1], id = query[2];
            while (index < len && nums[index] <= m) {
                trie.insert(nums[index]);
                ++index;
            }
            if (index == 0) {
                ans[id] = -1;
            } else {
                ans[id] = trie.getMaxXor(x);
            }
        }
        return ans;
    }

    static class Trie {
        static final int L = 30;
        Trie[] children = new Trie[2];

        public void insert(int val) {
            Trie node = this;
            for (int i = L - 1; i >= 0; --i) {
                int bit = (val >> i) & 1;
                if (node.children[bit] == null) {
                    node.children[bit] = new Trie();
                }
                node = node.children[bit];
            }
        }

        public int getMaxXor(int val) {
            int ans = 0;
            Trie node = this;
            for (int i = L - 1; i >= 0; --i) {
                int bit = (val >> i) & 1;
                if (node.children[bit ^ 1] != null) {
                    ans |= 1 << i;
                    bit ^= 1;
                }
                node = node.children[bit];
            }
            return ans;
        }
    }
}
