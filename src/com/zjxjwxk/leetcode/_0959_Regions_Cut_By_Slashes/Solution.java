package com.zjxjwxk.leetcode._0959_Regions_Cut_By_Slashes;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/1/25 13:16
 */
public class Solution {

    private int ans;

    public int regionsBySlashes(String[] grid) {
        int n = grid.length, m = grid[0].length();
        this.ans = n * m * 4;
        int[] parent = new int[n * m * 4];
        for (int i = 0; i < n * m * 4; ++i) {
            parent[i] = i;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                char ch = grid[i].charAt(j);
                if (ch == ' ') {
                    union(parent, getIndex(n, i, j, 0), getIndex(n, i, j, 1));
                    union(parent, getIndex(n, i, j, 1), getIndex(n, i, j, 2));
                    union(parent, getIndex(n, i, j, 2), getIndex(n, i, j, 3));
                } else if (ch == '/') {
                    union(parent, getIndex(n, i, j, 0), getIndex(n, i, j, 3));
                    union(parent, getIndex(n, i, j, 1), getIndex(n, i, j, 2));
                } else {
                    union(parent, getIndex(n, i, j, 0), getIndex(n, i, j, 1));
                    union(parent, getIndex(n, i, j, 2), getIndex(n, i, j, 3));
                }
                if (j > 0) {
                    union(parent, getIndex(n, i, j, 3), getIndex(n, i, j - 1, 1));
                }
                if (i > 0) {
                    union(parent, getIndex(n, i, j, 0), getIndex(n, i - 1, j, 2));
                }
            }
        }
        return this.ans;
    }

    private void union(int[] parent, int i, int j) {
        int parent1 = find(parent, i);
        int parent2 = find(parent, j);
        if (parent1 != parent2) {
            parent[parent1] = parent2;
            --this.ans;
        }
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

    private int getIndex(int n, int i, int j, int index) {
        return (i * n + j) * 4 + index;
    }
}
