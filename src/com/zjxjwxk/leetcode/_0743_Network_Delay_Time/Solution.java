package com.zjxjwxk.leetcode._0743_Network_Delay_Time;

import java.util.Arrays;

/**
 * Dijkstra
 * @author Xinkang Wu
 * @date 2021/8/24 21:28
 */
public class Solution {

    private static final int INF = Integer.MAX_VALUE;

    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(graph[i], INF);
        }
        for (int[] time : times) {
            graph[time[0] - 1][time[1] - 1] = time[2];
        }
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[k - 1] = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; ++i) {
            int u = -1, min = INF;
            for (int j = 0; j < n; ++j) {
                if (!visited[j] && dist[j] < min) {
                    min = dist[j];
                    u = j;
                }
            }
            if (u == -1) {
                return -1;
            }
            visited[u] = true;
            for (int v = 0; v < n; ++v) {
                if (!visited[v] && graph[u][v] != INF) {
                    dist[v] = Math.min(dist[v], dist[u] + graph[u][v]);
                }
            }
        }
        int ans = dist[0];
        for (int i = 1; i < n; ++i) {
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }
}
