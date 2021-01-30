package com.zjxjwxk.leetcode._0778_Swim_in_Rising_Water;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/1/30 10:53
 */
public class Solution {

    private static final int[][] MOVE = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };

    public int swimInWater(int[][] grid) {
        int n = grid.length, len = n * n;
        int[] heightToIndex = new int[len];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                heightToIndex[grid[i][j]] = getIndex(i, j, n);
            }
        }
        int[] parent = new int[len];
        for (int i = 0; i < len; ++i) {
            parent[i] = i;
        }
        for (int t = 0; t <= len - 1; ++t) {
            int index = heightToIndex[t];
            int row = index / n;
            int col = index % n;
            for (int i = 0; i < 4; ++i) {
                int adjRow = row + MOVE[i][0];
                int adjCol = col + MOVE[i][1];
                int adjIndex = getIndex(adjRow, adjCol, n);
                if (adjRow >= 0 && adjRow < n && adjCol >= 0 && adjCol < n && t > grid[adjRow][adjCol]) {
                    union(parent, index, adjIndex);
                }
            }
            if (find(parent, 0) == find(parent, len - 1)) {
                return t;
            }
        }
        return -1;
    }

    private void union(int[] parent, int i, int j) {
        int parent1 = find(parent, i);
        int parent2 = find(parent, j);
        if (parent1 != parent2) {
            parent[parent1] = parent2;
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

    private int getIndex(int i, int j, int n) {
        return i * n + j;
    }
}
