package com.zjxjwxk.leetcode._1631_Path_With_Minimum_Effort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/1/29 15:31
 */
public class Solution {

    public int minimumEffortPath(int[][] heights) {
        int n = heights.length, m = heights[0].length;
        int[] parent = new int[n * m];
        for (int i = 0; i < n * m; ++i) {
            parent[i] = i;
        }
        List<int[]> edgeList = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int index = getIndex(i, j, m);
                if (j > 0) {
                    edgeList.add(new int[]{index, getIndex(i, j - 1, m), Math.abs(heights[i][j] - heights[i][j - 1])});
                }
                if (i > 0) {
                    edgeList.add(new int[]{index, getIndex(i - 1, j, m), Math.abs(heights[i][j] - heights[i - 1][j])});
                }
            }
        }
        edgeList.sort(Comparator.comparingInt(edge -> edge[2]));
        for (int[] edge : edgeList) {
            union(parent, edge[0], edge[1]);
            if (find(parent, 0) == find(parent, n * m - 1)) {
                return edge[2];
            }
        }
        return 0;
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

    private int getIndex(int i, int j, int m) {
        return i * m + j;
    }
}
