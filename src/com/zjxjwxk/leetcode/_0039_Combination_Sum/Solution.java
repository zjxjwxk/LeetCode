package com.zjxjwxk.leetcode._0039_Combination_Sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/5/10 23:20
 */
public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>[] dp = new ArrayList[target + 1];
        for (int i = 0; i <= target; ++i) {
            dp[i] = new ArrayList<>();
        }
        for (int candidate : candidates) {
            if (candidate <= target) {
                dp[candidate].add(Collections.singletonList(candidate));
                for (int i = 0; i <= target - candidate; ++i) {
                    for (List<Integer> preList : dp[i]) {
                        List<Integer> addList = new ArrayList<>(preList);
                        addList.add(candidate);
                        dp[i + candidate].add(addList);
                    }
                }
            }
        }
        return dp[target];
    }
}
