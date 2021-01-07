package com.zjxjwxk.leetcode._0547_Number_of_Provinces;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/1/7 23:27
 */
public class Solution2 {

    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length, ans = 0;
        boolean[] vis = new boolean[len];
        for (int i = 0; i < len; ++i) {
            if (!vis[i]) {
                ++ans;
                dfs(isConnected, vis, i);
            }
        }
        return ans;
    }

    private void dfs(int[][] isConnected, boolean[] vis, int root) {
        vis[root] = true;
        for (int i = 0; i < isConnected.length; ++i) {
            if (i != root && isConnected[root][i] == 1 && !vis[i]) {
                dfs(isConnected, vis, i);
            }
        }
    }
}
