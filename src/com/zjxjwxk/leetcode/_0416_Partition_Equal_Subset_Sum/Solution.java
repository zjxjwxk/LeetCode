package com.zjxjwxk.leetcode._0416_Partition_Equal_Subset_Sum;

/**
 * 动态规划（二维数组）
 * @author zjxjwxk
 * @date 2020/10/11 9:28 上午
 */
public class Solution {

    public boolean canPartition(int[] nums) {
        int len = nums.length, sum = 0, target, maxNum = 0;
        for (int num : nums) {
            sum += num;
            if (num > maxNum) {
                maxNum = num;
            }
        }
        if (sum % 2 != 0) {
            return false;
        }
        target = sum / 2;
        if (maxNum > target) {
            return false;
        }
        boolean[][] dp = new boolean[len][target + 1];
        for (int i = 0; i < len; ++i) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < len; ++i) {
            for (int j = 1; j <= target; ++j) {
                if (nums[i] <= j) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - nums[i]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[len - 1][target];
    }
}
