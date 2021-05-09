package com.zjxjwxk.leetcode._0368_Largest_Divisible_Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 动态规划2
 * @author Xinkang Wu
 * @date 2021/5/9 20:47
 */
public class Solution2 {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        int len = nums.length, maxSize = 1, maxVal = nums[0];
        Arrays.sort(nums);
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; ++i) {
            dp[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxVal = nums[i];
            }
        }
        List<Integer> ans = new ArrayList<>();
        if (maxSize == 1) {
            ans.add(nums[0]);
            return ans;
        }
        for (int i = len - 1; i >= 0 && maxSize >= 1; --i) {
            if (dp[i] == maxSize && maxVal % nums[i] == 0) {
                ans.add(nums[i]);
                --maxSize;
                maxVal = nums[i];
            }
        }
        return ans;
    }
}
