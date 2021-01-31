package com.zjxjwxk.leetcode._0839_Similar_String_Groups;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/1/31 14:48
 */
public class Solution {

    public int numSimilarGroups(String[] strs) {
        int len = strs.length, ans = len;
        int[] parent = new int[len];
        for (int i = 0; i < len; ++i) {
            parent[i] = i;
        }
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (union(parent, strs, i, j)) {
                    --ans;
                }
            }
        }
        return ans;
    }

    private boolean union(int[] parent, String[] strs, int i, int j) {
        int parent1 = find(parent, i);
        int parent2 = find(parent, j);
        if (parent1 != parent2 && isSimilar(strs[i], strs[j])) {
            parent[parent1] = parent2;
            return true;
        }
        return false;
    }

    private int find(int[] parent, int index) {
        int root = index;
        while (root != parent[root]) {
            root = parent[root];
        }
        while (index != parent[index]) {
            int tempParent = parent[index];
            parent[index] = root;
            index = tempParent;
        }
        return index;
    }

    public boolean isSimilar(String str1, String str2) {
        int count = 0;
        char preCh1 = ' ', preCh2 = ' ';
        for (int i = 0; i < str1.length(); ++i) {
            char ch1 = str1.charAt(i), ch2 = str2.charAt(i);
            if (ch1 != ch2) {
                if (count == 0) {
                    preCh1 = ch1;
                    preCh2 = ch2;
                } else if (count == 1) {
                    if (ch1 != preCh2 || ch2 != preCh1) {
                        return false;
                    }
                } else {
                    return false;
                }
                ++count;
            }
        }
        return true;
    }
}
