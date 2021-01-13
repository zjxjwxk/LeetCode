package com.zjxjwxk.leetcode._0684_Redundant_Connection;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/1/13 22:36
 */
public class Solution2 {

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            parent[i] = i;
        }
        for (int[] edge : edges) {
            if (!union(parent, edge[0], edge[1])) {
                return edge;
            }
        }
        return new int[0];
    }

    private boolean union(int[] parent, int u, int v) {
        int parent1 = find(parent, u);
        int parent2 = find(parent, v);
        if (parent1 != parent2) {
            parent[parent1] = parent2;
            return true;
        }
        return false;
    }

    private int find(int[] parent, int i) {
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
