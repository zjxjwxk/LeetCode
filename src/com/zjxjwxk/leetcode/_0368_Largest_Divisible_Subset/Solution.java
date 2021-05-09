package com.zjxjwxk.leetcode._0368_Largest_Divisible_Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 动态规划1
 * @author Xinkang Wu
 * @date 2021/5/9 20:47
 */
public class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<Integer>[] dp = new ArrayList[len];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            dp[i] = new ArrayList<>();
            dp[i].add(nums[i]);
        }
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] % nums[j] == 0 && dp[i].size() <= dp[j].size()) {
                    dp[i] = new ArrayList<>(dp[j]);
                    dp[i].add(nums[i]);
                }
            }
            if (dp[i].size() > ans.size()) {
                ans = dp[i];
            }
        }
        return ans;
    }
}
