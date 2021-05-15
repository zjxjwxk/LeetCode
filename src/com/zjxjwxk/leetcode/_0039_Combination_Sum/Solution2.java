package com.zjxjwxk.leetcode._0039_Combination_Sum;

import java.util.ArrayList;
import java.util.List;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2021/5/15 17:30
 */
public class Solution2 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int[] candidates, int index, int target, List<Integer> combination, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(combination));
            return;
        }
        for (int i = index; i < candidates.length; ++i) {
            if (target >= candidates[i]) {
                combination.add(candidates[i]);
                dfs(candidates, i, target - candidates[i], combination, ans);
                combination.remove(combination.size() - 1);
            }
        }
    }
}
