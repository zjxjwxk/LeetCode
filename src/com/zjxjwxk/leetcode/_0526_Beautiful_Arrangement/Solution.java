package com.zjxjwxk.leetcode._0526_Beautiful_Arrangement;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯
 * @author Xinkang Wu
 * @date 2021/9/8 18:24
 */
public class Solution {

    public int countArrangement(int n) {
        List<Integer>[] matchList = new ArrayList[n + 1];
        boolean[] vis = new boolean[n + 1];
        for (int i = 0; i <= n; ++i) {
            matchList[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i % j == 0 || j % i == 0) {
                    matchList[i].add(j);
                }
            }
        }
        return dfs(1, n, matchList, vis);
    }

    private int dfs(int index, int n, List<Integer>[] matchList, boolean[] vis) {
        if (index == n + 1) {
            return 1;
        }
        int count = 0;
        for (int match : matchList[index]) {
            if (!vis[match]) {
                vis[match] = true;
                count += dfs(index + 1, n, matchList, vis);
                vis[match] = false;
            }
        }
        return count;
    }
}
