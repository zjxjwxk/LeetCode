package com.zjxjwxk.leetcode._0847_Shortest_Path_Visiting_All_Nodes;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 状态压缩 + 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/8/31 18:09
 */
public class Solution {

    public int shortestPathLength(int[][] graph) {
        int n = graph.length, ans = 0;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][1 << n];
        for (int i = 0; i < n; ++i) {
            queue.offer(new int[]{i, 1 << i, 0});
            visited[i][1 << i] = true;
        }
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int u = node[0], maskU = node[1], dist = node[2];
            if (maskU == (1 << n) - 1) {
                ans = dist;
                break;
            }
            for (int v : graph[u]) {
                int maskV = maskU | (1 << v);
                if (!visited[v][maskV]) {
                    queue.offer(new int[]{v, maskV, dist + 1});
                    visited[v][maskV] = true;
                }
            }
        }
        return ans;
    }
}
