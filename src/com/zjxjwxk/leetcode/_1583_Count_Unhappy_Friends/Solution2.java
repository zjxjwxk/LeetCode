package com.zjxjwxk.leetcode._1583_Count_Unhappy_Friends;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/9/7 17:17
 */
public class Solution2 {

    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[][] ranks = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                ranks[i][preferences[i][j]] = j;
            }
        }
        int[] matches = new int[n];
        for (int[] pair : pairs) {
            int p1 = pair[0], p2 = pair[1];
            matches[p1] = p2;
            matches[p2] = p1;
        }
        int ans = 0;
        for (int x = 0; x < n; ++x) {
            int y = matches[x];
            int index = ranks[x][y];
            for (int i = 0; i < index; ++i) {
                int u = preferences[x][i];
                int v = matches[u];
                if (ranks[u][x] < ranks[u][v]) {
                    ++ans;
                    break;
                }
            }
        }
        return ans;
    }
}
