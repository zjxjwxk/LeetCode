package com.zjxjwxk.leetcode.LCP_07_Send_Message;

import java.util.*;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/7/2 00:11
 */
public class Solution {

    private int ans;

    public int numWays(int n, int[][] relation, int k) {
        ans = 0;
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; ++i) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : relation) {
            graph[edge[0]].add(edge[1]);
        }
        dfs(graph, 0, 0, n, k);
        return ans;
    }

    private void dfs(List<Integer>[] graph, int index, int level, int n, int k) {
        if (level == k) {
            if (index == n - 1) {
                ++ans;
            }
            return;
        }
        for (Integer point : graph[index]) {
            dfs(graph, point, level + 1, n, k);
        }
    }
}
