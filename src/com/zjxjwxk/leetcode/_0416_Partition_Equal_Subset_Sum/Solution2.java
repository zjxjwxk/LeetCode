package com.zjxjwxk.leetcode._0416_Partition_Equal_Subset_Sum;

/**
 * 动态规划（一维数组）
 * @author zjxjwxk
 * @date 2020/10/11 11:11 上午
 */
public class Solution2 {

    public boolean canPartition(int[] nums) {
        int sum = 0, target, maxNum = 0;
        for (int num : nums) {
            sum += num;
            if (num > maxNum) {
                maxNum = num;
            }
        }
        if ((sum & 1) != 0) {
            return false;
        }
        target = sum >> 1;
        if (maxNum > target) {
            return false;
        }
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = target; j >= num; --j) {
                dp[j] |= dp[j - num];
            }
        }
        return dp[target];
    }
}
