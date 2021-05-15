package com.zjxjwxk.leetcode._0040_Combination_Sum_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2021/5/15 20:13
 */
public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int[] candidates, int index, int target, List<Integer> combination, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(combination));
            return;
        }
        for (int i = index; i < candidates.length && target >= candidates[i]; ++i) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            combination.add(candidates[i]);
            dfs(candidates, i + 1, target - candidates[i], combination, ans);
            combination.remove(combination.size() - 1);
        }
    }
}
