package com.zjxjwxk.leetcode._0216_Combination_Sum_III;

import java.util.ArrayList;
import java.util.List;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2021/5/16 11:46
 */
public class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int num, int k, int n, List<Integer> combination, List<List<Integer>> ans) {
        if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(combination));
            return;
        }
        for (int i = num; i <= 9 && k >= 1 && n >= num; ++i) {
            combination.add(i);
            dfs(i + 1, k - 1, n - i, combination, ans);
            combination.remove(combination.size() - 1);
        }
    }
}
