package com.zjxjwxk.leetcode._0446_Arithmetic_Slices_II_Subsequence;

import java.util.HashMap;
import java.util.Map;

/**
 * 动态规划+哈希表
 * @author Xinkang Wu
 * @date 2021/9/7 00:32
 */
public class Solution {

    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length, ans = 0;
        Map<Long, Integer>[] dp = new HashMap[len];
        for (int i = 0; i < len; ++i) {
            dp[i] = new HashMap<>();
        }
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < i; ++j) {
                long d = (long) nums[i] - nums[j];
                int count = dp[j].getOrDefault(d, 0);
                ans += count;
                dp[i].put(d, dp[i].getOrDefault(d, 0) + count + 1);
            }
        }
        return ans;
    }
}
