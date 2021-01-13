package com.zjxjwxk.leetcode._0684_Redundant_Connection;

import java.util.*;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2021/1/13 21:00
 */
public class Solution {

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        List<Integer>[] adjNodesArr = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; ++i) {
            adjNodesArr[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adjNodesArr[u].add(v);
            adjNodesArr[v].add(u);
        }
        boolean[] vis = new boolean[n + 1];
        Deque<Integer> path = new LinkedList<>();
        int circleNode = findCircle(adjNodesArr, path, vis, 1, -1);
        while (path.peekFirst() != circleNode) {
            path.pollFirst();
        }
        Set<Integer> circleNodeSet = new HashSet<>(path);
        for (int i = n - 1; i >= 0; --i) {
            if (circleNodeSet.contains(edges[i][0]) && circleNodeSet.contains(edges[i][1])) {
                return edges[i];
            }
        }
        return new int[0];
    }

    private int findCircle(List<Integer>[] adjNodesArr, Deque<Integer> path, boolean[] vis, int root, int pre) {
        vis[root] = true;
        path.offerLast(root);
        for (Integer adjNode : adjNodesArr[root]) {
            if (adjNode != pre) {
                if (vis[adjNode]) {
                    return adjNode;
                }
                int circleNode = findCircle(adjNodesArr, path, vis, adjNode, root);
                if (circleNode > 0) {
                    return circleNode;
                }
            }
        }
        path.pollLast();
        return 0;
    }
}
