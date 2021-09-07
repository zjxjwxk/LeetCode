package com.zjxjwxk.leetcode._1583_Count_Unhappy_Friends;

/**
 * 暴力
 * @author Xinkang Wu
 * @date 2021/9/7 17:17
 */
public class Solution {

    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[][] ranks = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                ranks[i][preferences[i][j]] = j;
            }
        }
        int m = n >> 1, ans = 0;
        boolean[] unhappy = new boolean[n];
        for (int i = 0; i < m; ++i) {
            for (int j = i + 1; j < m; ++j) {
                int index1 = pairs[i][0], index2 = pairs[i][1], index3 = pairs[j][0], index4 = pairs[j][1];
                if (ranks[index1][index3] < ranks[index1][index2] && ranks[index3][index1] < ranks[index3][index4]) {
                    unhappy[index1] = unhappy[index3] = true;
                }
                if (ranks[index1][index4] < ranks[index1][index2] && ranks[index4][index1] < ranks[index4][index3]) {
                    unhappy[index1] = unhappy[index4] = true;
                }
                if (ranks[index2][index3] < ranks[index2][index1] && ranks[index3][index2] < ranks[index3][index4]) {
                    unhappy[index2] = unhappy[index3] = true;
                }
                if (ranks[index2][index4] < ranks[index2][index1] && ranks[index4][index2] < ranks[index4][index3]) {
                    unhappy[index2] = unhappy[index4] = true;
                }
            }
        }
        for (int i = 0; i < n; ++i) {
            if (unhappy[i]) {
                ++ans;
            }
        }
        return ans;
    }
}
