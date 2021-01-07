package com.zjxjwxk.leetcode._0547_Number_of_Provinces;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/1/7 23:33
 */
public class Solution3 {

    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length, ans = 0;
        boolean[] vis = new boolean[len];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < len; ++i) {
            if (!vis[i]) {
                ++ans;
                queue.offer(i);
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int j = 0; j < len; ++j) {
                        if (!vis[j] && isConnected[node][j] == 1) {
                            queue.offer(j);
                            vis[j] = true;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
