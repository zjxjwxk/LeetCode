package com.zjxjwxk.leetcode._0802_Find_Eventual_Safe_States;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2021/8/30 13:42
 */
public class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int len = graph.length;
        int[] colors = new int[len];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            if (dfs(graph, i, colors)) {
                ans.add(i);
            }
        }
        return ans;
    }

    private boolean dfs(int[][] graph, int cur, int[] colors) {
        if (colors[cur] > 0) {
            return colors[cur] == 2;
        }
        colors[cur] = 1;
        for (int next : graph[cur]) {
            if (!dfs(graph, next, colors)) {
                return false;
            }
        }
        colors[cur] = 2;
        return true;
    }
}
