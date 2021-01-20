package com.zjxjwxk.leetcode._1584_Min_Cost_to_Connect_All_Points;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 最小生成树（Kruskal）
 * @author Xinkang Wu
 * @date 2021/1/19 12:18
 */
public class Solution {

    public int minCostConnectPoints(int[][] points) {
        int len = points.length, ans = 0, count = 0;
        List<Edge> edgeList = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                edgeList.add(new Edge(i, j, getLen(points, i, j)));
            }
        }
        edgeList.sort(Comparator.comparingInt(edge -> edge.len));
        int[] parent = new int[len];
        for (int i = 0; i < len; ++i) {
            parent[i] = i;
        }
        for (Edge edge : edgeList) {
            if (union(parent, edge.x, edge.y)) {
                ans += edge.len;
                if (++count == len - 1) {
                    return ans;
                }
            }
        }
        return ans;
    }

    private int getLen(int[][] points, int x, int y) {
        return Math.abs(points[x][0] - points[y][0]) + Math.abs(points[x][1] - points[y][1]);
    }

    private boolean union(int[] parent, int i, int j) {
        int parent1 = find(parent, i);
        int parent2 = find(parent, j);
        if (parent1 != parent2) {
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

    private class Edge {
        public int x;
        public int y;
        public int len;

        public Edge(int x, int y, int len) {
            this.x = x;
            this.y = y;
            this.len = len;
        }
    }
}
