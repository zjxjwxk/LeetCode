package com.zjxjwxk.leetcode._3147_Taking_Maximum_Energy_From_the_Mystic_Dungeon;

/**
 * 逆序遍历
 * 空间复杂度O(1)
 *
 * @author Xinkang Wu
 * @date 2025/10/11 00:02
 */
public class Solution2 {

    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length, maxEnergy = Integer.MIN_VALUE;
        for (int i = n - 1; i >= n - k; --i) {
            int sum = 0;
            for (int j = i; j >= 0; j -= k) {
                sum += energy[j];
                maxEnergy = Math.max(maxEnergy, sum);
            }
        }
        return maxEnergy;
    }
}
