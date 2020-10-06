package com.zjxjwxk.leetcode._0834_Sum_of_Distances_in_Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2020/10/6 5:46 下午
 */
public class Solution {

    private List<List<Integer>> graph;
    private int[] dp;
    private int[] sz;
    private int[] ans;

    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        dp = new int[N];
        sz = new int[N];
        ans = new int[N];
        graph = new ArrayList<>(N);
        for (int i = 0; i < N; ++i) {
            graph.add(new ArrayList<>(2));
        }
        for (int i = 0; i < N - 1; ++i) {
            int u = edges[i][0], v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        dfs1(0, -1);
        dfs2(0, -1);
        return ans;
    }

    private void dfs1(int u, int pre) {
        List<Integer> vList = graph.get(u);
        for (Integer v : vList) {
            if (v == pre) {
                continue;
            }
            dfs1(v, u);
            dp[u] += dp[v] + sz[v];
            sz[u] += sz[v];
        }
        ++sz[u];
    }

    private void dfs2(int u, int pre) {
        ans[u] = dp[u];
        List<Integer> vList = graph.get(u);
        for (Integer v : vList) {
            if (v == pre) {
                continue;
            }
            int dpu = dp[u], szu = sz[u], dpv = dp[v], szv = sz[v];
            dp[u] -= dp[v] + sz[v];
            sz[u] -= sz[v];
            dp[v] += dp[u] + sz[u];
            sz[v] += sz[u];
            dfs2(v, u);
            dp[u] = dpu;
            sz[u] = szu;
            dp[v] = dpv;
            sz[v] = szv;
        }
    }
}
