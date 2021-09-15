package com.zjxjwxk.leetcode._0797_All_Paths_From_Source_to_Target;

import java.util.ArrayList;
import java.util.List;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/9/15 17:00
 */
public class Solution {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, new ArrayList<>(), graph, 0);
        return ans;
    }

    private void dfs(List<List<Integer>> pathList, List<Integer> path, int[][] graph, int index) {
        path.add(index);
        if (index == graph.length - 1) {
            pathList.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }
        for (int nextIndex : graph[index]) {
            dfs(pathList, path, graph, nextIndex);
        }
        path.remove(path.size() - 1);
    }
}
