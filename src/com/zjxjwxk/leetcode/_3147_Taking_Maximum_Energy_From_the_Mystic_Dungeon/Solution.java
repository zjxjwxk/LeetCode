package com.zjxjwxk.leetcode._3147_Taking_Maximum_Energy_From_the_Mystic_Dungeon;

/**
 * 动态规划
 * 空间复杂度O(n)
 *
 * @author Xinkang Wu
 * @date 2025/10/11 00:02
 */
public class Solution {

    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length, maxEnergy = Integer.MIN_VALUE;
        int[] dp = new int[k];
        System.arraycopy(energy, 0, dp, 0, k);
        for (int i = k; i < n; ++i) {
            int j = i % k;
            dp[j] = Math.max(energy[i], dp[j] + energy[i]);
        }
        for (int j = 0; j < k; ++j) {
            maxEnergy = Math.max(maxEnergy, dp[j]);
        }
        return maxEnergy;
    }
}
