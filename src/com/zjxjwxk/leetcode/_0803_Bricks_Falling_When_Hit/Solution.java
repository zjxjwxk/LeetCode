package com.zjxjwxk.leetcode._0803_Bricks_Falling_When_Hit;

/**
 * 并查集（逆序考虑）
 * @author Xinkang Wu
 * @date 2021/1/16 14:37
 */
public class Solution {

    private final int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };

    public int[] hitBricks(int[][] grid, int[][] hits) {
        int m = grid.length, n = grid[0].length, hitsLen = hits.length, top = m * n;
        int[][] copy = new int[m][n];
        int[] ans = new int[hitsLen];
        for (int i = 0; i < m; ++i) {
            System.arraycopy(grid[i], 0, copy[i], 0, n);
        }
        int[] parent = new int[top + 1], counts = new int[top + 1];
        for (int i = 0; i <= top; ++i) {
            parent[i] = i;
            counts[i] = 1;
        }
        for (int[] hit : hits) {
            copy[hit[0]][hit[1]] = 0;
        }
        for (int i = 0; i < n; ++i) {
            parent[i] = top;
            if (copy[0][i] == 1) {
                ++counts[top];
            }
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (copy[i][j] == 1) {
                    if (j > 0 && copy[i][j - 1] == 1) {
                        union(parent, counts, getIndex(i, j, n), getIndex(i, j - 1, n), top);
                    }
                    if (copy[i - 1][j] == 1) {
                        union(parent, counts, getIndex(i, j, n), getIndex(i - 1, j, n), top);
                    }
                }
            }
        }
        for (int k = hitsLen - 1; k >= 0; --k) {
            int i = hits[k][0], j = hits[k][1], index = getIndex(i, j, n), nextI, nextJ, nextIndex, preTopCount = counts[top];
            if (grid[i][j] != 0) {
                if (i == 0) {
                    ++counts[top];
                }
                copy[i][j] = 1;
                for (int[] direction : directions) {
                    nextI = i + direction[0];
                    nextJ = j + direction[1];
                    if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n && copy[nextI][nextJ] == 1) {
                        nextIndex = getIndex(nextI, nextJ, n);
                        union(parent, counts, index, nextIndex, top);
                    }
                }
                ans[k] = Math.max(0, counts[top] - preTopCount - 1);
            }
        }
        return ans;
    }

    private void union(int[] parent, int[] counts, int index1, int index2, int top) {
        int parent1 = find(parent, index1);
        int parent2 = find(parent, index2);
        if (parent1 != parent2) {
            if (parent1 == top) {
                parent[parent2] = parent1;
                counts[parent1] += counts[parent2];
            } else {
                parent[parent1] = parent2;
                counts[parent2] += counts[parent1];
            }
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
