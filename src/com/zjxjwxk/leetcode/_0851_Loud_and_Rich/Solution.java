package com.zjxjwxk.leetcode._0851_Loud_and_Rich;

import java.util.*;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/12/15 15:18
 */
public class Solution {

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        List<Integer>[] richerListArr = new List[n];
        for (int i = 0; i < n; ++i) {
            richerListArr[i] = new ArrayList<>();
        }
        for (int[] rich : richer) {
            richerListArr[rich[1]].add(rich[0]);
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < n; ++i) {
            dfs(richerListArr, i, quiet, ans);
        }
        return ans;
    }

    private void dfs(List<Integer>[] richerListArr, int index, int[] quiet, int[] ans) {
        if (ans[index] != -1) {
            return;
        }
        ans[index] = index;
        for (int richer : richerListArr[index]) {
            dfs(richerListArr, richer, quiet, ans);
            if (quiet[ans[richer]] < quiet[ans[index]]) {
                ans[index] = ans[richer];
            }
        }
    }
}
