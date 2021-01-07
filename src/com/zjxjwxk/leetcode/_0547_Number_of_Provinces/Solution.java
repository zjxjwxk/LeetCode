package com.zjxjwxk.leetcode._0547_Number_of_Provinces;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/1/7 22:53
 */
public class Solution {

    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length, ans = 0;
        int[] parent = new int[len];
        for (int i = 0; i < len; ++i) {
            parent[i] = i;
        }
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (i != j && isConnected[i][j] == 1) {
                    union(parent, i, j);
                }
            }
        }
        for (int i = 0; i < len; ++i) {
            if (parent[i] == i) {
                ++ans;
            }
        }
        return ans;
    }

    private void union(int[] parent, int i, int j) {
        int parent1 = findParent(parent, i);
        int parent2 = findParent(parent, j);
        if (parent1 != parent2) {
            parent[parent1] = parent2;
        }
    }

    private int findParent(int[] parent, int i) {
        int root = i;
        while (root != parent[root]) {
            root = parent[root];
        }
        while (i != parent[i]) {
            int tempParent = parent[i];
            parent[i] = root;
            i = tempParent;
        }
        return i;
    }
}
